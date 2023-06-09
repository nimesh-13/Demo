package com.railway.reservation.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TrainDetails {
	
    @Id
    private int trainId;
    private String name;
    private String date;
    private String startFrom;
    private String endTo;   
    private String arrival_time;
    private String departure_time;
    
    private TrainSeats trainSeats;
    
    
    
    
	public TrainDetails() {
		super();
		
	}




	public TrainDetails(int trainId, String name, String date, String startFrom, String endTo, String arrival_time,
			String departure_time, TrainSeats trainSeats) {
		super();
		this.trainId = trainId;
		this.name = name;
		this.date = date;
		this.startFrom = startFrom;
		this.endTo = endTo;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.trainSeats = trainSeats;
	}




	public int getTrainId() {
		return trainId;
	}




	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getStartFrom() {
		return startFrom;
	}




	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}




	public String getEndTo() {
		return endTo;
	}




	public void setEndTo(String endTo) {
		this.endTo = endTo;
	}




	public String getArrival_time() {
		return arrival_time;
	}




	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}




	public String getDeparture_time() {
		return departure_time;
	}




	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}




	public TrainSeats getTrainSeats() {
		return trainSeats;
	}




	public void setTrainSeats(TrainSeats trainSeats) {
		this.trainSeats = trainSeats;
	}




	
   
    
    
    

}
