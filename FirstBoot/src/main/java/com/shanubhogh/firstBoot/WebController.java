package com.shanubhogh.firstBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class WebController {
	@RequestMapping("/")
	ModelAndView home(ModelAndView modelAndView) {
		
		modelAndView.setViewName("home");
		modelAndView.getModel().put("name", "Narayana");

		return modelAndView;
	}
}
