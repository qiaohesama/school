package com.mnnu.api.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class GymReserveVO {@ApiModelProperty("开始时间")
private LocalDateTime beginTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("实付价格")
    private Integer realPrice;

    @ApiModelProperty("订单价格")
    private Integer orderPrice;

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
