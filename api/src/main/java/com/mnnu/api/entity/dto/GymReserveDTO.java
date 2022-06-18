package com.mnnu.api.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class GymReserveDTO {

    @ApiModelProperty("开始时间")
    private LocalDateTime beginTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("实付价格")
    private Integer realPrice;

    @ApiModelProperty("订单价格")
    private Integer orderPrice;

    @ApiModelProperty("用户id ")
    private Long userId;

    @ApiModelProperty("场馆id")
    private Integer venueId;

    @ApiModelProperty("体育场id")
    private Integer stadiumId;

    @ApiModelProperty("订单序列号")
    private String serialNumber;

    private LocalDateTime orderTime;

    private LocalDateTime paymentTime;

    @ApiModelProperty("订单状态 1未支付 2已支付\\等待进场 3已取消 4已超时 5在场馆 6超时未使用")
    private Integer status;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("联系方式")
    private String phone;
}
