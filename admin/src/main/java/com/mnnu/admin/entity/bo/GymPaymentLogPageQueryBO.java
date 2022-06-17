package com.mnnu.admin.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@ApiModel("支付日志页面")
@EqualsAndHashCode(callSuper = true)
public class GymPaymentLogPageQueryBO extends BasePageQueryBO {
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
