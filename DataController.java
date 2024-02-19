package com.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {
	@PostMapping("/per")
	public String CalculatePercentage(@RequestParam String name, Double marks1,Double marks2,Double marks3,Double marks4) {
		  Double total = (marks1 + marks2 + marks3 + marks4)/4;
        return "Hey "+name+" ,your percentage is "+total+"%";
	}
	

}
