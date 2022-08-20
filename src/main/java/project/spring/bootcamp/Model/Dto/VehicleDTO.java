package project.spring.bootcamp.Model.Dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import project.spring.bootcamp.Model.Enum.Sort;

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
