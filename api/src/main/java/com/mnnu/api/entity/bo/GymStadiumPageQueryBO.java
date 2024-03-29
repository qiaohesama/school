package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("订单页面")
public class GymStadiumPageQueryBO extends BasePageQueryBO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("商标图片")
    private String logoPic;

    @ApiModelProperty("场馆的类型  1国有场馆 2私人场馆 ")
    private Integer type;

    @ApiModelProperty("场馆名称")
    private String name;

    @ApiModelProperty("管理员名称")
    private String admin;

    @ApiModelProperty("场馆电话")
    private String phone;

    @ApiModelProperty("管理员手机号")
    private String mobile;

    @ApiModelProperty("场馆地址")
    private String address;

    @ApiModelProperty("状态  1开放  2闭关 3禁用")
    private Integer status;

}
