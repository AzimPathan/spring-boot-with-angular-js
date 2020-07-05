package com.azimpathan.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azimpathan.demo.model.Person;

@RestController
public class DataController {
	
	@RequestMapping("/person")
	public List<Person> getPerson()
	{
		List<Person> list = new ArrayList<Person>();
		Person p1 = new Person("Azim","Pathan");
		Person p2 = new Person("Harry","Potter");
		Person p3 = new Person("Spring","Boot");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		return list;
	}
}
