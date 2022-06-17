package com.mnnu.admin.entity.bo;

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

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @ApiModelProperty("角色的id")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty("用户的id")
    @TableField("user_id")
    private Long userId;



}
