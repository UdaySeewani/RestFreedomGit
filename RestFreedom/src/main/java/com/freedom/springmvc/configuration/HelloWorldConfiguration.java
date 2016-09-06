package com.freedom.springmvc.configuration;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.freedom.springmvc")
public class HelloWorldConfiguration {
     
 
}