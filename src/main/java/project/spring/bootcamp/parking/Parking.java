package project.spring.bootcamp.parking;


import lombok.Data;
import project.spring.bootcamp.vehicle.Vehicle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_parking")
@Data
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "get_in")
    private Date getIn;

    @NotNull
    @Column(name = "get_out")
    private Date getOut;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


}
