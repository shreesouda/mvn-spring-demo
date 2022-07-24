package com.shree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sumcontroller {
	@RequestMapping(value="/sum")
	public void add() {
		System.out.println("it works");
	}

}
