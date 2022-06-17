package com.mnnu.admin.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class GymVenueVO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("体育馆id")
    @TableField("stadium_id")
    private Integer stadiumId;

    @ApiModelProperty("场馆类型 1足球 2羽毛 ")
    @TableField("`type`")
    private Integer type;

    @ApiModelProperty("场馆名字")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("预约的价格")
    @TableField("price")
    private Integer price;

    @ApiModelProperty("场馆限制人数")
    @TableField("limit_count")
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


    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
