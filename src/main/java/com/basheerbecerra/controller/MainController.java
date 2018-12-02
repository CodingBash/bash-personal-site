package com.basheerbecerra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home() {
		return "newhome";
	}

	/*
	 * @RequestMapping(value = { "/aboutme" }, method = RequestMethod.GET)
	 * public String aboutme() { return "aboutme"; }
	 */
	@RequestMapping(value = { "/contact" }, method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}

	/*
	@RequestMapping(value = { "/portfolio" }, method = RequestMethod.GET)
	public String portfolio() {
		return "portfolio";
	}

	@RequestMapping(value = { "/resume" }, method = RequestMethod.GET)
	public String resume() {
		return "resume";
	}

	*/

}
