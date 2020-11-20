package com.lijiaying.keshe.portal.service.impl;

import com.lijiaying.keshe.portal.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 用户注册serviceImpl
     * @param username
     * @param password
     * @param email
     * @param name
     * @param telephone
     * @param sex
     * @param birthday
     * @param code
     */
    @Override
    public void register(String username, String password, String email, String name, String telephone, String sex, Date birthday, String code) {

    }
}
