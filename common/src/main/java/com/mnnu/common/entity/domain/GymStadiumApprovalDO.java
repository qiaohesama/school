package com.mnnu.common.entity.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 体育场提交审批资料
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_stadium_approval")
@ApiModel(value = "GymStadiumApprovalDO对象", description = "体育场提交审批资料")
public class GymStadiumApprovalDO implements Serializable {

    private static final long serialVersionUID = 1L;

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
