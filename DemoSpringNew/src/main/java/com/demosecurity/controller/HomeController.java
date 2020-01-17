/**
 * 
 */
package com.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adms.java1
 *
 */
@RestController
public class HomeController {
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping("/")
	public String index() {

		return "index";
	}

	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@RequestMapping("/")
	public String login() {

		return "login";
	}

	//@RequestMapping(value = "/admin", method = RequestMethod.GET)
	@RequestMapping("/")
	public String admin() {

		return "admin";
	}

}
