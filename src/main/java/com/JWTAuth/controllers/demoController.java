package com.JWTAuth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demoController")
public class demoController {
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello");
	}

}
