package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping
	public String sayHi(){
		
		
		return "HOLA A TODOS POR ALÁ";
	}
	
	
	

}
