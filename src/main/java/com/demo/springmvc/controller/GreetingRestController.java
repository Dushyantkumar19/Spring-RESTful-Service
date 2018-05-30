/**
 * 
 */
package com.demo.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springmvc.domain.Message;

/**
 * Controller class for greeting User
 *
 * @author dushyant sahu
 * @version 0.1
 * @since May, 2018
 */
@RestController
public class GreetingRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Demo.";
	}

	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {
		Message msg = new Message(player, "Hello " + player);
		return msg;
	}

	
}
