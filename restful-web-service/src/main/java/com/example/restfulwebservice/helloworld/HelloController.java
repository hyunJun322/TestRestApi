package com.example.restfulwebservice.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

	private final MessageSource messageSource;
	
	@GetMapping("/hello-world-a")
	public String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) 
	{
		
		return messageSource.getMessage("greeting.message",null, locale);
	}
}
