package com.railway.reservation.traindetailservice;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.reservation.exception.TrainDetailNotFoundException;
import com.railway.reservation.model.TrainDetails;
import com.railway.reservation.repository.TrainDetailRepository;

@Service
public class TrainDetailServiceImpl implements TrainDetailService{
	
	@Autowired
	private TrainDetailRepository repo;

	@Override
	public TrainDetails createTrainDetails(TrainDetails traindDetails) {
	
		return repo.save(traindDetails);
	}
	

	@Override
	public ArrayList<TrainDetails> getTrainDetailsByLocation(String date ,String startFrom, String endTo) throws TrainDetailNotFoundException {
		
		  ArrayList<TrainDetails> traindetails =  repo.findByData(date,startFrom, endTo);
		  
		  if(traindetails.isEmpty()) {
			  throw new TrainDetailNotFoundException("Plese enter the valid details");  
		  }
		 return traindetails;			
	}
	

	@Override
	public void deleteTrainDetailsById(int trainId) {
		repo.deleteById(trainId);
		
	}
	

	@Override
	public TrainDetails updateTrainDetails(String date, TrainDetails trn) throws TrainDetailNotFoundException {
		TrainDetails trainDetails = repo.findByDate(date);
		
			if(trainDetails != null) {
				
				trainDetails.setName(trn.getName());
				trainDetails.setStartFrom(trn.getStartFrom());
				trainDetails.setEndTo(trn.getEndTo());
				trainDetails.setArrival_time(trn.getArrival_time());
				trainDetails.setDeparture_time(trn.getDeparture_time());
				trainDetails.setTrainSeats(trn.getTrainSeats());
				repo.save(trainDetails);
				return  trainDetails;
				
			
		}else {
			throw new TrainDetailNotFoundException("Train details not found for the specified date: " + date);
			
		}
		
		
	}
	
	
	
	
	
	

	
    

	
}
