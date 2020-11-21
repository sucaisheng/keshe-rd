package com.lijiaying.keshe.portal.service.impl;

import com.lijiaying.keshe.mapper.TbUserMapper;
import com.lijiaying.keshe.model.TbUser;
import com.lijiaying.keshe.model.TbUserExample;
import com.lijiaying.keshe.portal.util.MD5Util;
import com.lijiaying.keshe.portal.service.UserService;
import com.lijiaying.keshe.portal.util.MailUtils;
import com.lijiaying.keshe.portal.util.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper userMapper;

    /**
     * 用户注册serviceImpl
     * @param username
     * @param password
     * @param email
     * @param name
     * @param telephone
     * @param sex
     * @param birthday
     * @return
     */
    @Override
    public int register(String username, String password, String email, String name, String telephone, String sex, Date birthday) {
        //判断数据库里面是否存在该用户
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(email);
        List<TbUser> tbUsers = userMapper.selectByExample(userExample);
        if (!CollectionUtils.isEmpty(tbUsers)){
            return 2;
        }

        //用户不存在，添加用户
        TbUser user = new TbUser();
        user.setUsername(username);
        user.setTelephone(telephone);
        user.setBirthidy(birthday);
        user.setEmail(email);
        user.setName(name);
        user.setSex(sex);
        user.setPassword(MD5Util.MD5Encode(password));
        user.setStatus(0);
        //获取UUID，用于设置用户的code
        user.setCode(Uuid.getUuid());
        int insert = userMapper.insert(user);
        user.setPassword(null);
        String content="<a href='http://localhost:8085/info/active?code="+user.getCode()+"'>点击激活【招聘网网】</a>";
        MailUtils.sendMail(user.getEmail(),content,"点击激活账户");
        return insert;
    }

    @Override
    public Boolean active(String code) {
        //判断是否有该用户
        TbUserExample userExample = new TbUserExample();
        TbUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCodeEqualTo(code);
        List<TbUser> tbUsers = userMapper.selectByExample(userExample);
        if (!CollectionUtils.isEmpty(tbUsers)){
            return false;
        }

        //查找到该用户，激活账户，将账户status设置为1
        TbUser user = tbUsers.get(0);
        user.setStatus(1);
        userMapper.updateByExample(user,userExample);
        return true;
    }
}
