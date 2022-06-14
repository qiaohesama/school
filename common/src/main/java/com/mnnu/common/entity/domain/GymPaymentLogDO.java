package com.mnnu.common.entity.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-13
 */
@Getter
@Setter
@TableName("gym_payment_log")
@ApiModel(value = "GymPaymentLogDO对象", description = "")
public class GymPaymentLogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @ApiModelProperty("交易的序列号")
    @TableField("serial_number")
    private String serialNumber;

    @ApiModelProperty("接收到回调的时间")
    @TableField("notify_time")
    private LocalDateTime notifyTime;

    @ApiModelProperty("付款状态")
    @TableField("`status`")
    private Integer status;

    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("实际付款金额")
    @TableField("payment_price")
    private Integer paymentPrice;


}
