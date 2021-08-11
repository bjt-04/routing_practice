package com.ben.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String dojo(@PathVariable("location") String location) {
		String output;
		if(location.equals("dojo")) {
			output = "The dojo is awesome!";
		} else if(location.equals("burbank-dojo")) {
			output = "Burbank Dojo is located in Southern California.";
		} else if(location.equals("san-jose")) {
			output = "San-Jose dojo is headquarters.";
		} else {
			output = location + " is awesome!";
		}
//		System.out.println(location);
		return output;
		
	}

}
