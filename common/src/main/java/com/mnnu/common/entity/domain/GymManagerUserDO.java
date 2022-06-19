package com.mnnu.common.entity.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_manager_user")
@ApiModel(value = "GymManagerUserDO对象", description = "管理员表")
public class GymManagerUserDO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
