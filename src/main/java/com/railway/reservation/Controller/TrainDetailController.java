package com.railway.reservation.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.reservation.exception.TrainDetailNotFoundException;
import com.railway.reservation.model.TrainDetails;
import com.railway.reservation.traindetailservice.TrainDetailService;

@RestController
public class TrainDetailController {
	
	@Autowired
	private TrainDetailService service;
	
	@PostMapping("/post")
	public TrainDetails add(@RequestBody TrainDetails trainDetails) {
		
		return  service.createTrainDetails(trainDetails);
	}
	
	@GetMapping("/get/{date}/{startFrom}/{endTo}")
	public ArrayList<TrainDetails> searchTrain(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd")  String date ,@PathVariable String startFrom ,@PathVariable String endTo )throws TrainDetailNotFoundException{
		return service.getTrainDetailsByLocation(date,startFrom, endTo);
	}
	
	@DeleteMapping("/delete/{trainId}")
	public void deleteTrainDetails(@PathVariable int trainId) {
		service.deleteTrainDetailsById(trainId);
		
	}
	
	@PutMapping("/update/{date}")
	public TrainDetails updateTrainDetails(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") String date ,@RequestBody TrainDetails trn) throws TrainDetailNotFoundException {
		return service.updateTrainDetails(date, trn);
		
	}
	
}
