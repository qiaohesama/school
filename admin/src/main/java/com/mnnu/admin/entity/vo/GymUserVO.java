package com.mnnu.admin.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("场馆详细信息")
public class GymUserVO extends BasePageQueryBO {
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty("雪花主键")
    @TableId("id")
    private Long id;

    @ApiModelProperty("手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("头像地址")
    @TableField("head_pic")
    private String headPic;

    @ApiModelProperty("身份证号")
    @TableField("id_num")
    private String idNum;

    @ApiModelProperty("状态 1正常 0禁用")
    @TableField("`status`")
    private Integer status;

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
