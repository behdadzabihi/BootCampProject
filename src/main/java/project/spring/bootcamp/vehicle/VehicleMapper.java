package project.spring.bootcamp.vehicle;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    Vehicle toVehicle(VehicleDTO vehicleDTO);

    VehicleDTO toVehicleDTO(Vehicle vehicle);

    List<VehicleDTO> toVehicleDTOList(List<Vehicle> vehicleList);
}
