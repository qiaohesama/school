package com.mnnu.api.entity.vo;

import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel("一页订单")
@EqualsAndHashCode(callSuper = true)
public class GymUserVO extends BasePageQueryBO {
    @ApiModelProperty("雪花主键")
    private Long id;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("头像地址")
    private String headPic;

    @ApiModelProperty("身份证号")
    private String idNum;

    @ApiModelProperty("状态 1正常 0禁用")
    private Integer status;
}
