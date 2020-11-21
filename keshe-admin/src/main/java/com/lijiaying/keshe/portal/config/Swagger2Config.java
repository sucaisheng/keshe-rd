package com.lijiaying.keshe.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 * Created by qingmeng on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)  //指定api类型
                .apiInfo(apiInfo())  //用于定义api文档汇总信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lijiaying.keshe.portal.controller")) //指定controller包
                .paths(PathSelectors.any())  //所有controller
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("keshe前台系统")
                .description("keshe前台模块")
                .contact("lijiaying") //联系人信息
                .version("1.0")
                .build();
    }

}
