package com.railway.reservation.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Station {
	
	@Id
	private int platformNo;
	private String name;
	private String location;
	
	

}
