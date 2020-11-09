package com.qingmeng.qiuzhidi.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by qingmeng on 2020/10/24.
 */
@Configuration
@MapperScan({"com.lijiaying.keshe.mapper","com.lijiaying.keshe.search.dao"})
public class MyBatisConfig {
}
