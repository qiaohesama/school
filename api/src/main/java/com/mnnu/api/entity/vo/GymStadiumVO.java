package com.mnnu.api.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("场馆详细信息")
public class GymStadiumVO extends BasePageQueryBO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("商标图片")
    @TableField("logo_pic")
    private String logoPic;

    @ApiModelProperty("场馆的类型 1国有场馆 2私人场馆 ")
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
    @ApiModelProperty("预约的价格 以分为单位 ")
    private Integer price;

    @ApiModelProperty("开放日期范围数组 [[2020-05-06,2020-05-13]]")
    private String dateArr;

    @ApiModelProperty("时间开放范围数组 [ [14:00:00,16:00:00]]")
    private String timeArr;

    @ApiModelProperty("开放星期 数组 [1,2,4,6,7]")
    private String weekendArr;

    @ApiModelProperty("多图数组")
    private String picArr;

    @ApiModelProperty("首图")
    private String headPic;

    @ApiModelProperty("长图片数组 ")
    private String longPicArr;

    @ApiModelProperty("评分")
    private Integer point;

    @ApiModelProperty("场馆介绍")
    private String introduce;

    private Long commentNum;
}
