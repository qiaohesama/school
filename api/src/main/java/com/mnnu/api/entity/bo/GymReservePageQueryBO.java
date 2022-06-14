package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import com.mnnu.common.entity.domain.GymReserveDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("订单页面")
public class GymReservePageQueryBO extends BasePageQueryBO {

    @ApiModelProperty("开始时间")
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
