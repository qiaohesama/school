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
 * 体育馆场馆表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_venue")
@ApiModel(value = "GymVenueDO对象", description = "体育馆场馆表")
public class GymVenueDO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
