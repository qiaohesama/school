package com.mnnu.common.entity.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 前台角色表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-16
 */
@Getter
@Setter
@TableName("gym_role")
@ApiModel(value = "GymRoleDO对象", description = "前台角色表")
public class GymRoleDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @ApiModelProperty("角色")
    @TableField("role")
    private String role;


}
