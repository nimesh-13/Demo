package com.railway.reservation.traindetailservice;

import java.util.ArrayList;
import java.util.Date;

import com.railway.reservation.exception.TrainDetailNotFoundException;
import com.railway.reservation.model.TrainDetails;

public interface TrainDetailService {
	
	public  TrainDetails createTrainDetails(TrainDetails traindDetails);
	
	public 	ArrayList<TrainDetails> getTrainDetailsByLocation( String date ,String startFrom , String endTo)throws TrainDetailNotFoundException;
	
	public void deleteTrainDetailsById(int trainId);
	
	public  TrainDetails updateTrainDetails(String date , TrainDetails trn) throws TrainDetailNotFoundException;
	

}
