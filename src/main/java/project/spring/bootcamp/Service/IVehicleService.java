package project.spring.bootcamp.Service;

import project.spring.bootcamp.Model.Vehicle;

import java.util.List;

public interface IVehicleService {

    Vehicle save(Vehicle vehicle);

    Vehicle update(Vehicle vehicle);

    void delete(Long id);

    Vehicle getById(Long id);

    List<Vehicle> getAll();

}
