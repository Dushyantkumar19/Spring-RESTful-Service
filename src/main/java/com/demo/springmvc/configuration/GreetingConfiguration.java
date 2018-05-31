/**
 * 
 */
package com.demo.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Java Configuration class for Greeting Spring Rest Application
 *
 * @author dushyant sahu
 * @version 0.1
 * @since May, 2018
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.demo.springmvc")
public class GreetingConfiguration {
	

}