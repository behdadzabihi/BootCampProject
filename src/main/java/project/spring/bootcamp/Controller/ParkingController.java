package project.spring.bootcamp.Controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.spring.bootcamp.Service.IParkingService;
import project.spring.bootcamp.Model.Parking;
import project.spring.bootcamp.Model.Dto.ParkingDTO;
import project.spring.bootcamp.Model.Mapper.ParkingMapper;


import java.util.List;

@RestController
@RequestMapping(value = "/parking/")
@AllArgsConstructor
public class ParkingController {

    private IParkingService service;

    private ParkingMapper mapper;

    @PostMapping("/v1")
    public ResponseEntity save(@RequestBody ParkingDTO parkingDTO){
        Parking parking=mapper.toParking(parkingDTO);
        service.save(parking);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("v1")
    public ResponseEntity update(@RequestBody ParkingDTO parkingDTO){
        Parking parking=mapper.toParking(parkingDTO);
        service.update(parking);
        return ResponseEntity.ok(parking);
    }

    @GetMapping("v1")
    public ResponseEntity<List<ParkingDTO>> getAll(){
        List<Parking> parkingList=service.getAll();
        List<ParkingDTO> parkingDTOS=mapper.toParkingDTOList(parkingList);
        return ResponseEntity.ok(parkingDTOS);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<ParkingDTO> getById(@PathVariable Long id){
        Parking parking=service.getById(id);
        ParkingDTO parkingDTO=mapper.toParkingDTO(parking);
        return ResponseEntity.ok(parkingDTO);
    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/get-by-vehicle/{vehId}")
    public ResponseEntity<List<ParkingDTO>> getByEmployeeId(@PathVariable Long vehID ){
        List<Parking> parkings=    service.getAllByVehicle(vehID);
        List<ParkingDTO> parkingDTOS=mapper.toParkingDTOList(parkings);
        return ResponseEntity.ok(parkingDTOS);
    }

    @GetMapping("/v1/calculate/{id}")
    public ResponseEntity<Long> calculate(@PathVariable Long id){
        Long result=service.calculate(id);
        return ResponseEntity.ok(result);
    }
}
