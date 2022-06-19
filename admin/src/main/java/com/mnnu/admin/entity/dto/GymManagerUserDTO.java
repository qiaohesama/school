package com.mnnu.admin.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
public class GymManagerUserDTO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("管理员手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("管理员密码")
    @TableField("`password`")
    private String password;

    @ApiModelProperty("角色 1超级管理员 2普通管理员")
    @TableField("role")
    private Integer role;

    @ApiModelProperty("是否禁用 0启用 1禁用")
    @TableField("banned")
    private Integer banned;


}
