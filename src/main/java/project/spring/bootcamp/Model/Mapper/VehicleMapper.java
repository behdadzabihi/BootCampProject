package project.spring.bootcamp.Model.Mapper;

import org.mapstruct.Mapper;
import project.spring.bootcamp.Model.Dto.VehicleDTO;
import project.spring.bootcamp.Model.Vehicle;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    Vehicle toVehicle(VehicleDTO vehicleDTO);

    VehicleDTO toVehicleDTO(Vehicle vehicle);

    List<VehicleDTO> toVehicleDTOList(List<Vehicle> vehicleList);
}
