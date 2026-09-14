package com.kaiky.kairos.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date-time")
public class DateTimeController {
	
	@GetMapping
	public LocalDateTime getCurrentDateTime()
	{
		return LocalDateTime.now();
	}	
}