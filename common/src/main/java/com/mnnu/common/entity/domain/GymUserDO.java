package com.mnnu.common.entity.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.std.ToStringSerializer;

/**
 * <p>
 * 前台用户表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_user")
@ToString
@ApiModel(value = "GymUserDO对象", description = "前台用户表")
public class GymUserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("雪花主键")
    @TableId(value = "id", type = IdType.AUTO)
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
