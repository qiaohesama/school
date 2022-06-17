package com.mnnu.admin.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ApiModel("yeianvj")
public class GymUserDTO {

    @ApiModelProperty("雪花主键")
    @TableId("id")
    private Long id;

    @ApiModelProperty("状态 1正常 0禁用")
    @TableField("`status`")
    private Integer status;

    @ApiModelProperty("逻辑删除字段 0存在 1删除")
    @TableField("deleted")
    @TableLogic
    private Integer deleted;

}
