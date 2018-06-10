package daca.myevent.myevent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {
	
	@RequestMapping("/")
	@ResponseBody
	public String printHello() {
		return "Hello";
	}
}
