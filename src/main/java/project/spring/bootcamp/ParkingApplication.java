package project.spring.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.spring.bootcamp.vehicle.Sort;
import project.spring.bootcamp.vehicle.Vehicle;
import project.spring.bootcamp.vehicle.VehicleRepository;

import java.util.List;

@SpringBootApplication
public class ParkingApplication implements ApplicationRunner {

    @Autowired
    VehicleRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ParkingApplication.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(repository.count()==0){
            Vehicle vehicle1=new Vehicle();
            vehicle1.setModel("benz");
            vehicle1.setTag("123456");
            vehicle1.setSort(Sort.PERSONAL);
            Vehicle vehicle1Save=repository.save(vehicle1);

            Vehicle vehicle2=new Vehicle();
            vehicle2.setModel("bmw");
            vehicle2.setTag("456789");
            vehicle2.setSort(Sort.PERSONAL);
            Vehicle vehicle2Save=repository.save(vehicle2);


            Vehicle vehicle3=new Vehicle();
            vehicle3.setModel("audi");
            vehicle3.setTag("987654");
            vehicle3.setSort(Sort.COMMERCIAL);
            Vehicle vehicle3Save=repository.save(vehicle3);

            List<Vehicle> vehicleList= (List<Vehicle>) repository.findAll();


        }
    }
}
