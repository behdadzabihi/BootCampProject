package project.spring.bootcamp.parking;

import org.springframework.data.repository.PagingAndSortingRepository;
import project.spring.bootcamp.vehicle.Vehicle;

import java.util.List;

public interface ParkingRepository extends PagingAndSortingRepository<Parking,Long> {

    List<Parking> findAllByVehicle(Vehicle vehicle);
}
