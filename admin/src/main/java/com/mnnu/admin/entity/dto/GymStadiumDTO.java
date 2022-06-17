package com.mnnu.admin.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("修改状态捏")
public class GymStadiumDTO {
    @ApiModelProperty("状态  1开放  2闭关 3禁用")
    @TableField("`id`")
    private Integer id;
    @ApiModelProperty("状态  1开放  2闭关 3禁用")
    @TableField("`status`")
    private Integer status;
}
