package com.mnnu.admin.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class GymStadiumPageQueryBO extends BasePageQueryBO {
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @ApiModelProperty("商标图片")
    @TableField("logo_pic")
    private String logoPic;

    @ApiModelProperty("场馆的类型  1国有场馆 2私人场馆 ")
    @TableField("`type`")
    private Integer type;

    @ApiModelProperty("场馆名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("场馆负责人id")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty("管理员名称")
    @TableField("admin")
    private String admin;

    @ApiModelProperty("场馆电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("管理员手机号")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("场馆地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("状态  1开放  2闭关 3禁用")
    @TableField("`status`")
    private Integer status;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
