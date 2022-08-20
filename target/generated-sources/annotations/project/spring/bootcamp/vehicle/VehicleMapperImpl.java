package project.spring.bootcamp.vehicle;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import project.spring.bootcamp.Model.Dto.VehicleDTO;
import project.spring.bootcamp.Model.Mapper.VehicleMapper;
import project.spring.bootcamp.Model.Vehicle;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-20T08:55:16+0430",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public Vehicle toVehicle(VehicleDTO vehicleDTO) {
        if ( vehicleDTO == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setId( vehicleDTO.getId() );
        vehicle.setModel( vehicleDTO.getModel() );
        vehicle.setTag( vehicleDTO.getTag() );
        vehicle.setSort( vehicleDTO.getSort() );

        return vehicle;
    }

    @Override
    public VehicleDTO toVehicleDTO(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleDTO vehicleDTO = new VehicleDTO();

        vehicleDTO.setId( vehicle.getId() );
        vehicleDTO.setModel( vehicle.getModel() );
        vehicleDTO.setTag( vehicle.getTag() );
        vehicleDTO.setSort( vehicle.getSort() );

        return vehicleDTO;
    }

    @Override
    public List<VehicleDTO> toVehicleDTOList(List<Vehicle> vehicleList) {
        if ( vehicleList == null ) {
            return null;
        }

        List<VehicleDTO> list = new ArrayList<VehicleDTO>( vehicleList.size() );
        for ( Vehicle vehicle : vehicleList ) {
            list.add( toVehicleDTO( vehicle ) );
        }

        return list;
    }
}
