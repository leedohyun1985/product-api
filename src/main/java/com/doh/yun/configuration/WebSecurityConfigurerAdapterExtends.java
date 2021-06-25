package com.doh.yun.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 * @author Dohyun Lee
 * @see https://velog.io/@ayoung0073/springboot-JWT
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfigurerAdapterExtends extends WebSecurityConfigurerAdapter{
	
}
