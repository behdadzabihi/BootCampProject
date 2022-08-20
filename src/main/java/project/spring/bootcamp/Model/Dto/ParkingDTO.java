package project.spring.bootcamp.Model.Dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ParkingDTO {

    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = true,hidden = false)
    private Date getIn;

    @ApiModelProperty(required = true,hidden = false)
    private Date getOut;

    @ApiModelProperty(required = true,hidden = false)
    private VehicleDTO vehicle;


}
