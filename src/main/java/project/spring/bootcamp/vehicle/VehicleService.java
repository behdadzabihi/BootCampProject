package project.spring.bootcamp.vehicle;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VehicleService implements IVehicleService{

    private VehicleRepository repository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle lastVehicle=getById(vehicle.getId());
        lastVehicle.setModel(vehicle.getModel());
        lastVehicle.setTag(vehicle.getTag());
        lastVehicle.setSort(vehicle.getSort());
        return repository.save(lastVehicle);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Vehicle getById(Long id) {
        Optional<Vehicle> optionalVehicle=repository.findById(id);
        if(!optionalVehicle.isPresent())
            throw new RuntimeException("Error");

        return optionalVehicle.get();
    }

    @Override
    public List<Vehicle> getAll() {
        return (List<Vehicle>) repository.findAll();
    }
}
