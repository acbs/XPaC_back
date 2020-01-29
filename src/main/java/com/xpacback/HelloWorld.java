package com.xpacback;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloWorld {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> testeHello() {
		return ResponseEntity.ok().body("Hello World!");
	}

}