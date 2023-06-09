package com.railway.reservation.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.railway.reservation.model.TrainDetails;
import com.railway.reservation.repository.TrainDetailRepository;
import com.railway.reservation.traindetailservice.TrainDetailService;
import com.railway.reservation.traindetailservice.TrainDetailServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainDetailsServiceImplTest {

    @Test
    void testCreateTrainDetails() {
    	TrainDetailRepository repo = Mockito.mock(TrainDetailRepository.class);
    	TrainDetailService trainDetailService = new TrainDetailServiceImpl();

        
        TrainDetails trainDetails = new TrainDetails();
        trainDetails.setName("Train A");
        
        Mockito.when(repo.save(trainDetails)).thenReturn(trainDetails);

        assertEquals(trainDetails, trainDetailService.createTrainDetails(trainDetails));
        Mockito.verify(repo).save(trainDetails);
    }
}

