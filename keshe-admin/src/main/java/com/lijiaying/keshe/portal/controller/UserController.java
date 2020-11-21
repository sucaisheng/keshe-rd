package com.lijiaying.keshe.portal.controller;

import com.lijiaying.keshe.common.api.CommonResult;
import com.lijiaying.keshe.portal.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * 用户登录、注册、找回密码接口
 */
@Controller
@Api(tags = "UserController", description = "用户登录、注册、找回密码接口")
@RequestMapping("/info")
public class UserController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UserService userService;

    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestParam(value = "username") String username,
                                 @RequestParam(value = "password") String password,
                                 @RequestParam(value = "email") String email,
                                 @RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "telephone", required = false) String telephone,
                                 @RequestParam(value = "sex") String sex,
                                 @RequestParam(value = "birthday", required = false) Date birthday,
                                 @RequestParam(value = "code") String code
                                 ){
        //设置type来判断注册情况
        int type = 1;

        //校验验证码
        HttpSession session = request.getSession();
        //获取session里面的验证码
        String checkCode = (String) session.getAttribute("CHECKCODE_SERVER");
        //移除session里面的验证码
        session.removeAttribute("CHECKCODE_SERVER");
        //比较验证码
        if (checkCode == null || checkCode.equalsIgnoreCase(code)){
            type = 2;
        }

        //根据type的返回值来判断注册情况
        //type=1，验证码正确
        if (type == 1){
            int i = userService.register(username, password, email, name, telephone, sex, birthday);
            if (i == 1){
                return CommonResult.success("注册成功,请点击邮件激活账户");
            }else {
                //其他情况，用户已经存在
                return CommonResult.failed("该用户已存在");
            }
        }else {
            return CommonResult.failed("验证码错误");
        }
    }

    @ApiOperation("激活用户")
    @RequestMapping(value = "/active", method = RequestMethod.GET)
    @ResponseBody
    public void active(@RequestParam(value = "code") String code,
                       HttpServletResponse response){
        Boolean flag = userService.active(code);
        //判断标记
        String msg = null;
        if(flag){
            //激活成功
            msg = "激活成功，请<a href='login.html'>登录</a>";
        }else{
            //激活失败
            msg = "激活失败，请联系管理员!";
        }
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
