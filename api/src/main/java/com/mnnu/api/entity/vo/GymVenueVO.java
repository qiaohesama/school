package com.mnnu.api.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;

public class GymVenueVO {
    @ApiModelProperty("场馆类型 1足球 2羽毛 ")
    private Integer type;

    @ApiModelProperty("场馆名字")
    private String name;

    @ApiModelProperty("预约的价格")
    private Integer price;

    @ApiModelProperty("场馆限制人数")
    private Integer limitCount;

    @TableField("date_arr")
    private String dateArr;

    @TableField("time_arr")
    private String timeArr;

    @TableField("weekend_arr")
    private String weekendArr;

    @ApiModelProperty("状态 1开启 2闭馆 ")
    @TableField("`status`")
    private Integer status;
}
