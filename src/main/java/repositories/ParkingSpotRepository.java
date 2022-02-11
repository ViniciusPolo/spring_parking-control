package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ParkingSpotModel;

@Repository //a extensão já possui essa notação, colocando para fin didaticos
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>
{

}
