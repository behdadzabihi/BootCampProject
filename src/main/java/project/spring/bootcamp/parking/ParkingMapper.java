package project.spring.bootcamp.parking;

import org.mapstruct.Mapper;
import project.spring.bootcamp.vehicle.VehicleMapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {VehicleMapper.class})
public interface ParkingMapper {

    Parking toParking(ParkingDTO parkingDTO);

    ParkingDTO toParkingDTO(Parking parking);

    List<ParkingDTO> toParkingDTOList(List<Parking> parkingList);
}
