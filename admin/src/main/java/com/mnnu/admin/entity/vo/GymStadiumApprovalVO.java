package com.mnnu.admin.entity.vo;

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
public class GymStadiumApprovalVO  extends BasePageQueryBO {

    @TableId("id")
    private Integer id;

    @ApiModelProperty("图片数组")
    @TableField("pic_arr")
    private String picArr;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("体育场的id")
    @TableField("stadium_id")
    private Integer stadiumId;

    @ApiModelProperty("状态 0审批中 1通过 2驳回 ")
    @TableField("`status`")
    private Integer status;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
