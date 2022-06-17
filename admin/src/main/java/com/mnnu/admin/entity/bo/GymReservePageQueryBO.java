package com.mnnu.admin.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("订单页面")
public class GymReservePageQueryBO extends BasePageQueryBO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单id 时间到秒加上redis自增，前缀为170")
    @TableId("order_id")
    private String orderId;

    @ApiModelProperty("用户id ")
    @TableField("user_id")
    private Long userId;

    @TableField("venue_id")
    private Integer venueId;

    @ApiModelProperty("场馆id")
    @TableField("stadium_id")
    private Integer stadiumId;

    @ApiModelProperty("开始时间")
    @TableField("begin_time")
    private LocalDateTime beginTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("实付价格")
    @TableField("real_price")
    private Integer realPrice;

    @ApiModelProperty("订单价格")
    @TableField("order_price")
    private Integer orderPrice;

    @ApiModelProperty("订单序列号")
    @TableField("serial_number")
    private String serialNumber;

    @TableField("order_time")
    private LocalDateTime orderTime;

    @TableField("payment_time")
    private LocalDateTime paymentTime;

    @ApiModelProperty("订单状态 1未支付 2已支付\\等待进场 3已取消 4已超时 5在场馆 6超时未使用")
    @TableField("`status`")
    private Integer status;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @ApiModelProperty("姓名")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("联系方式")
    @TableField("phone")
    private String phone;

}
