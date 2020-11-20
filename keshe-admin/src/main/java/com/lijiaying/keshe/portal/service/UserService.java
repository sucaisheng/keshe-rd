package com.lijiaying.keshe.portal.service;

import java.util.Date;

public interface UserService {

    /**
     * 用户注册service
     * @param username
     * @param password
     * @param email
     * @param name
     * @param telephone
     * @param sex
     * @param birthday
     * @param code
     */
    void register(String username, String password, String email, String name, String telephone, String sex, Date birthday, String code);
}
