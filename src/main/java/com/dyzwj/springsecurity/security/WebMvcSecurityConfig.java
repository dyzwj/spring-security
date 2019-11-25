package com.dyzwj.springsecurity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebMvcSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic()
            //表单认证
            http.formLogin()
                .and()
                    //授权
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
