package com.example.demo;

import java.util.Date;
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
		System.out.println(item);
		item.setDate(new Date());
		service.add(item);
	}
	
	@PostMapping("/delete")
	@CrossOrigin
	public void delete(@RequestBody ResultData item) {
		System.out.println("delete" + item);
		service.delete(item);
	}
}
