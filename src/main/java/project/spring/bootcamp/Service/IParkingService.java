package project.spring.bootcamp.Service;

import project.spring.bootcamp.Model.Parking;

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
