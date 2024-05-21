package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {
	
	@Autowired
	DataService service;
	
	@GetMapping("/")
	@CrossOrigin
	public List<? extends ResultDataInterface> fruits() {
		return service.getAll();
	}
	
	@PostMapping("/add")
	@CrossOrigin
	public void add(@RequestBody  ResultData item) {
		service.add(item);
	}
}
