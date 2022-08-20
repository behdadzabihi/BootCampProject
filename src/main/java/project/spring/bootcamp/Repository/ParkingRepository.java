package project.spring.bootcamp.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import project.spring.bootcamp.Model.Parking;
import project.spring.bootcamp.Model.Vehicle;

import java.util.List;

public interface ParkingRepository extends PagingAndSortingRepository<Parking,Long> {

    List<Parking> findAllByVehicle(Vehicle vehicle);
}
