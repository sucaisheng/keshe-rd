package src.main.java.com.lijiaying.keshe.portal.config;

import com.qingmeng.qiuzhidi.portal.service.UmsMemberService;
import com.qingmeng.qiuzhidi.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * qiuzhidi-security模块相关配置
 * Created by qingmeng on 2019/11/5.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class KesheSecurityConfig extends SecurityConfig {

    @Autowired
    private UmsMemberService memberService;

    @Override
    public void configure(WebSecurity web) {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers(
                "/static/**",
                "/favicon.ico",
                "/error",
                "/index.html",
                "/uploads/**");
    }

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> memberService.loadUserByUsername(username);
    }
}
