package com.mnnu.admin.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
@Data
@ApiModel("yenianvj")
@EqualsAndHashCode(callSuper = true)
public class GymManagerUserBO extends BasePageQueryBO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("管理员手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;


    @ApiModelProperty("角色 1超级管理员 2普通管理员")
    @TableField("role")
    private Integer role;

    @ApiModelProperty("是否禁用 0启用 1禁用")
    @TableField("banned")
    private Integer banned;

}
