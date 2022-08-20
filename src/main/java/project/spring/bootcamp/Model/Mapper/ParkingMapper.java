package project.spring.bootcamp.Model.Mapper;

import org.mapstruct.Mapper;
import project.spring.bootcamp.Model.Parking;
import project.spring.bootcamp.Model.Dto.ParkingDTO;

import java.util.List;

@Mapper(componentModel = "spring",uses = {VehicleMapper.class})
public interface ParkingMapper {

    Parking toParking(ParkingDTO parkingDTO);

    ParkingDTO toParkingDTO(Parking parking);

    List<ParkingDTO> toParkingDTOList(List<Parking> parkingList);
}
