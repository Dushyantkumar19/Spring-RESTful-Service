/**
 * 
 */
package com.demo.springmvc.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Domain class
 *
 * @author dushyant sahu
 * @version 0.1
 * @since May, 2018
 */
@XmlRootElement(name = "player")
public class Message {

	String name;
	String text;

	public Message(){
		
	}
	
	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}

	@XmlElement
	public String getName() {
		return name;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}

}
