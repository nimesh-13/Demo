package com.railway.reservation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TrainSeats {
	
	@Id
	private int seatNo;
	private int available_ACseat;
	private int available_SLseat;
	private int ACfare;
	private int SLfare;
	public TrainSeats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrainSeats(int seatNo, int available_ACseat, int available_SLseat, int aCfare, int sLfare) {
		super();
		this.seatNo = seatNo;
		this.available_ACseat = available_ACseat;
		this.available_SLseat = available_SLseat;
		ACfare = aCfare;
		SLfare = sLfare;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getAvailable_ACseat() {
		return available_ACseat;
	}
	public void setAvailable_ACseat(int available_ACseat) {
		this.available_ACseat = available_ACseat;
	}
	public int getAvailable_SLseat() {
		return available_SLseat;
	}
	public void setAvailable_SLseat(int available_SLseat) {
		this.available_SLseat = available_SLseat;
	}
	public int getACfare() {
		return ACfare;
	}
	public void setACfare(int aCfare) {
		ACfare = aCfare;
	}
	public int getSLfare() {
		return SLfare;
	}
	public void setSLfare(int sLfare) {
		SLfare = sLfare;
	}
	
	 
	
	
	

}
