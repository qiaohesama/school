package com.mnnu.api.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel("场馆详细信息")
public class GymStadiumVO {
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

}
