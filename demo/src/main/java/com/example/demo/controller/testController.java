package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmpDao;
import com.example.demo.dto.EmpDto;
import com.example.demo.dto.MessageDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class testController {
	
	@Autowired
	EmpDao empdao;
	
	
	@GetMapping(path="/api")
	public String getParam(
			@RequestParam(name="name1",defaultValue="true") String name1
			) {
		return "param1 : "+name1;
	}
	
	
	@GetMapping(path="/message")
	public MessageDto getMessageTest(
				@RequestParam(name="name") String name
			) {
		
		MessageDto message = new MessageDto();
		message.setId("Test");
		message.setMessage(name);
		
		return message;
		
	}
	
	
	@GetMapping(path="/emp")
	public List<EmpDto> emptest() throws Exception{
		
		
			List<EmpDto> aa = empdao.selects();	
			return aa;
		
	}
	
	
	
}
