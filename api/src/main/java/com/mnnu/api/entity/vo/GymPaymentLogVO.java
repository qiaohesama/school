package com.mnnu.api.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@ApiModel("一页订单")
@EqualsAndHashCode(callSuper = true)
public class GymPaymentLogVO extends BasePageQueryBO {
    @ApiModelProperty("交易的序列号")
    private String serialNumber;

    @ApiModelProperty("接收到回调的时间")
    private LocalDateTime notifyTime;

    @ApiModelProperty("付款状态")
    private Integer status;

    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("实际付款金额")
    private Integer paymentPrice;

}
