package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "John Doe");
		return "welcome";
	}

	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("title", "Spring Security Hello World");
		modelandview.addObject("message", "This is protected page - Database Page!");
		modelandview.setViewName("admin");
		return modelandview;
	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("title", "Spring Security Hello World");
		modelandview.addObject("message", "This is protected page - Admin Page!");
		modelandview.setViewName("admin");
		return modelandview;
	}
}
