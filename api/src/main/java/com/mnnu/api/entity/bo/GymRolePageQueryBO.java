package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mnnu.common.entity.domain.GymRoleDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("查看用户属于什么角色")
public class GymRolePageQueryBO extends GymRoleDO {
    private Long id;

    @ApiModelProperty("角色")
    private String role;
}
