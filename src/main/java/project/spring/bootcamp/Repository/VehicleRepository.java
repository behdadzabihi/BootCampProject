package project.spring.bootcamp.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import project.spring.bootcamp.Model.Vehicle;

@Repository
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle,Long> {
}
