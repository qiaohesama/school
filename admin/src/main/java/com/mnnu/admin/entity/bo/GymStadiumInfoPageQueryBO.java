package com.mnnu.admin.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import io.swagger.annotations.ApiModelProperty;


public class GymStadiumInfoPageQueryBO extends BasePageQueryBO {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @ApiModelProperty("预约的价格 以分为单位 ")
    @TableField("price")
    private Integer price;

    @ApiModelProperty("体育场的id")
    @TableField("stadium_id")
    private Integer stadiumId;

    @ApiModelProperty("开放日期范围数组 [[2020-05-06,2020-05-13]]")
    @TableField("date_arr")
    private String dateArr;

    @ApiModelProperty("时间开放范围数组 [ [14:00:00,16:00:00]]")
    @TableField("time_arr")
    private String timeArr;

    @ApiModelProperty("开放星期 数组 [1,2,4,6,7]")
    @TableField("weekend_arr")
    private String weekendArr;

    @ApiModelProperty("多图数组")
    @TableField("pic_arr")
    private String picArr;

    @ApiModelProperty("首图")
    @TableField("head_pic")
    private String headPic;

    @ApiModelProperty("长图片数组 ")
    @TableField("long_pic_arr")
    private String longPicArr;

    @ApiModelProperty("评分")
    @TableField("`point`")
    private Integer point;

    @ApiModelProperty("场馆介绍")
    @TableField("introduce")
    private String introduce;

    @ApiModelProperty("经纬度")
    @TableField("latitude_longitude")
    private String latitudeLongitude;

}
