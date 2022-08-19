package project.spring.bootcamp.parking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.spring.bootcamp.vehicle.IVehicleService;
import project.spring.bootcamp.vehicle.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class ParkingService implements IParkingService{

    private ParkingRepository repository;

    private IVehicleService vehicleService;
    @Override
    public Parking save(Parking parking) {
        Long vehID=parking.getVehicle().getId();
        Vehicle vehicle=vehicleService.getById(vehID);
        parking.setVehicle(vehicle);
        return repository.save(parking);
    }

    @Override
    public Parking update(Parking parking) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Parking getById(Long id) {
        Optional<Parking> optionalParking=repository.findById(id);
        if(!optionalParking.isPresent())
            throw new RuntimeException("Error");

        return optionalParking.get();
    }

    @Override
    public List<Parking> getAll() {
        return (List<Parking>) repository.findAll();
    }

    @Override
    public List<Parking> getAllByVehicle(Long vehId) {
        Vehicle vehicle=vehicleService.getById(vehId);
        List<Parking> parkingList=repository.findAllByVehicle(vehicle);
        return parkingList;
    }

    @Override
    public Long calculate(Long id) {
        Parking parking = getById(id);
        long base = 3500L;
        long resultToMinutes;
        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
        Long l1 = parking.getGetIn().getTime();
        Long l2 = parking.getGetOut().getTime();
        long result = l2 - l1;
        resultToMinutes
                = TimeUnit.MILLISECONDS.toMinutes(result);
        if (resultToMinutes <= 60) {
            return base;
        } else {
            return (resultToMinutes / 60) * base;
        }
    }
}
