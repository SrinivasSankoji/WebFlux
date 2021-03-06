package com.example.demo.health.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private  long id;
	private  String name;

}
