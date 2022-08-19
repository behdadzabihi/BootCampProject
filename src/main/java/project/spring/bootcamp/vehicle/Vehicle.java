package project.spring.bootcamp.vehicle;

import lombok.Data;
import project.spring.bootcamp.parking.Parking;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "tbl_vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "model")
    private String model;

    @NotNull
    @Column(name = "tag")
    private String tag;

    @NotNull
    @Column(name = "sort")
    @Enumerated(value = EnumType.STRING)
    private Sort sort;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "vehicle",cascade = CascadeType.ALL)
    List<Parking> parkingList;

}
