package project.spring.bootcamp.vehicle;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/vehicle/")
@AllArgsConstructor
public class VehicleController {

    private IVehicleService service;

    private VehicleMapper mapper;

    @PostMapping("/v1")
    public ResponseEntity save(@RequestBody VehicleDTO vehicleDTO){
        Vehicle vehicle=mapper.toVehicle(vehicleDTO);
        service.save(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("v1")
    public ResponseEntity update(@RequestBody VehicleDTO vehicleDTO){
        Vehicle vehicle=mapper.toVehicle(vehicleDTO);
        service.update(vehicle);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping("v1")
    public ResponseEntity<List<VehicleDTO>> getAll(){
        List<Vehicle> vehicleList=service.getAll();
        List<VehicleDTO> vehicleDTOS=mapper.toVehicleDTOList(vehicleList);
        return ResponseEntity.ok(vehicleDTOS);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<VehicleDTO> getById(@PathVariable Long id){
        Vehicle vehicle=service.getById(id);
        VehicleDTO vehicleDTO=mapper.toVehicleDTO(vehicle);
        return ResponseEntity.ok(vehicleDTO);
    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
