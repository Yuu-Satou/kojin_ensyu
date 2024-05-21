package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DataService {
	@Autowired
	ResultRepository repository;
	
	public List<? extends ResultDataInterface> getAll() {
		System.out.println("Service:getAll");
		return repository.findAll();
	}
	
	public void add(ResultDataInterface item) {
		System.out.println("Service:add [" + item + "]");
		if (item instanceof ResultData) {
			ResultData savedItem = repository.saveAndFlush((ResultData)item);
			return;
		}
		return;
	}


}
