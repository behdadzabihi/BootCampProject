package project.spring.bootcamp.parking;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.spring.bootcamp.Model.Dto.ParkingDTO;
import project.spring.bootcamp.Model.Mapper.ParkingMapper;
import project.spring.bootcamp.Model.Parking;
import project.spring.bootcamp.Model.Mapper.VehicleMapper;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-20T08:55:16+0430",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ParkingMapperImpl implements ParkingMapper {

    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public Parking toParking(ParkingDTO parkingDTO) {
        if ( parkingDTO == null ) {
            return null;
        }

        Parking parking = new Parking();

        parking.setId( parkingDTO.getId() );
        parking.setGetIn( parkingDTO.getGetIn() );
        parking.setGetOut( parkingDTO.getGetOut() );
        parking.setVehicle( vehicleMapper.toVehicle( parkingDTO.getVehicle() ) );

        return parking;
    }

    @Override
    public ParkingDTO toParkingDTO(Parking parking) {
        if ( parking == null ) {
            return null;
        }

        ParkingDTO parkingDTO = new ParkingDTO();

        parkingDTO.setId( parking.getId() );
        parkingDTO.setGetIn( parking.getGetIn() );
        parkingDTO.setGetOut( parking.getGetOut() );
        parkingDTO.setVehicle( vehicleMapper.toVehicleDTO( parking.getVehicle() ) );

        return parkingDTO;
    }

    @Override
    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        if ( parkingList == null ) {
            return null;
        }

        List<ParkingDTO> list = new ArrayList<ParkingDTO>( parkingList.size() );
        for ( Parking parking : parkingList ) {
            list.add( toParkingDTO( parking ) );
        }

        return list;
    }
}
