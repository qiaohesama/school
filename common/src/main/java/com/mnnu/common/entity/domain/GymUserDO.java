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
 * 前台用户表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-16
 */
@Getter
@Setter
@TableName("gym_user")
@ApiModel(value = "GymUserDO对象", description = "前台用户表")
public class GymUserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("雪花主键")
    @TableId("id")
    private Long id;

    @ApiModelProperty("手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty("头像地址")
    @TableField("head_pic")
    private String headPic;

    @ApiModelProperty("身份证号")
    @TableField("id_num")
    private String idNum;

    @ApiModelProperty("状态 1正常 0禁用")
    @TableField("`status`")
    private Integer status;

    @ApiModelProperty("逻辑删除字段 0存在 1删除")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
