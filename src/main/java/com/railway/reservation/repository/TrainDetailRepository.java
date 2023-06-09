package com.railway.reservation.repository;



import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.railway.reservation.model.TrainDetails;



public interface TrainDetailRepository extends MongoRepository<TrainDetails,Integer>  {
	
	
	@Query("{'date' : :#{#date} 'startFrom' : :#{#startFrom}, 'endTo' : :#{#endTo}}")
	ArrayList<TrainDetails> findByData(@Param("date") String date ,@Param("startFrom") String startFrom, @Param("endTo") String endTo);
	
	
	public TrainDetails findByDate(String date);
	
	

}
