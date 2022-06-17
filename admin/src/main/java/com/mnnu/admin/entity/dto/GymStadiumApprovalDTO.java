package com.mnnu.admin.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GymStadiumApprovalDTO {
    @TableId("id")
    private Integer id;

    @ApiModelProperty("状态 0审批中 1通过 2驳回 ")
    @TableField("`status`")
    private Integer status;

}
