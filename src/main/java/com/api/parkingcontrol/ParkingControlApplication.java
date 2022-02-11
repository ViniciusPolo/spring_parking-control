package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //apenas mostrando que essa classe pode ser usada como controller, não será criado o controller para o HelloWorld
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}
		
		@GetMapping("/") //rota, simples assim?
		public String index() {
			return "Hello World!!";
		
	}

}
