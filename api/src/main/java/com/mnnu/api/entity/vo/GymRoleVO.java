package com.mnnu.api.entity.vo;

import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("一页订单")
@EqualsAndHashCode(callSuper = true)
public class GymRoleVO extends BasePageQueryBO {
    private Long id;

    @ApiModelProperty("角色")
    private String role;
}
