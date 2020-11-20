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

import java.util.Date;

/**
 * 用户登录、注册、找回密码接口
 */
@Controller
@Api(tags = "UserController", description = "用户登录、注册、找回密码接口")
@RequestMapping("/info")
public class UserController {
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
        userService.register(username, password, email, name, telephone, sex, birthday, code);
        return CommonResult.success("注册成功");
    }
}
