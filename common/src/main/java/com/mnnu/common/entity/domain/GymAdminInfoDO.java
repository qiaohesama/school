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
 * 普通用户申请成为场馆管理员需要缴交的材料
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_admin_info")
@ApiModel(value = "GymAdminInfoDO对象", description = "普通用户申请成为场馆管理员需要缴交的材料")
public class GymAdminInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("图片数组")
    @TableField("pic_arr")
    private String picArr;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
