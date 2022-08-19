package project.spring.bootcamp.vehicle;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class VehicleDTO {

    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = true,hidden = false)
    private String model;

    @ApiModelProperty(required = true,hidden = false)
    private String tag;

    @ApiModelProperty(required = true,hidden = false)
    private Sort sort;
}
