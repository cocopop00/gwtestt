package com.example.demo.dto;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Service
@Getter
@Setter
@Data
public class MessageDto {

	private String id;
	private String message;
	
}
