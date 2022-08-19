package project.spring.bootcamp.parking;

import java.util.LinkedList;
import java.util.List;

public interface IParkingService {

    Parking save(Parking parking);

    Parking update(Parking parking);

    void delete(Long id);

    Parking getById(Long id);

    List<Parking> getAll();

    List<Parking> getAllByVehicle(Long vehId);

    Long calculate(Long id);
}
