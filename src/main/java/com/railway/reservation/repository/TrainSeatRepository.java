package com.railway.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.railway.reservation.model.TrainSeats;

public interface TrainSeatRepository extends MongoRepository<TrainSeats, Integer> {

}
