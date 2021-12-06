package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors.";
	}
	
	@RequestMapping(value="tomorrow", method=RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location") String location){
		return "Congratulations! You will soon travel to " + location + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") Integer number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		} else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
	}
}
