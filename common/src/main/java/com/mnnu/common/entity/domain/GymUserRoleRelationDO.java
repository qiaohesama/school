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
 * 
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-13
 */
@Getter
@Setter
@TableName("gym_user_role_relation")
@ApiModel(value = "GymUserRoleRelationDO对象", description = "")
public class GymUserRoleRelationDO implements Serializable {

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
