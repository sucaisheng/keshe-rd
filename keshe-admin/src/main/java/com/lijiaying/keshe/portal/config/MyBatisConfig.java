package src.main.java.com.lijiaying.keshe.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by qingmeng on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.lijiaying.keshe.mapper","com.lijiaying.keshe.portal.dao"})
public class MyBatisConfig {
}
