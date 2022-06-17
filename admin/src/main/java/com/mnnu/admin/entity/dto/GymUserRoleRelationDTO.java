package com.mnnu.admin.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GymUserRoleRelationDTO {
    @TableId("id")
    private Long id;

    @ApiModelProperty("角色的id")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty("用户的id")
    @TableField("user_id")
    private Long userId;
}
