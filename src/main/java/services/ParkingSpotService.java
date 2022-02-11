package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.ParkingSpotModel;
import repositories.ParkingSpotRepository;

@Service //Indicar que essa classe é um serviço, podemos criar uma interface para está classe
public class ParkingSpotService {
	
	final //ou @autoWired
	ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService (ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

}	
