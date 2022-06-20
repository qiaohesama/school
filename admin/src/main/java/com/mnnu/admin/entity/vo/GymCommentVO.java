package com.mnnu.admin.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("一页订单")

public class GymCommentVO extends BasePageQueryBO {
    @JsonSerialize(using = ToStringSerializer.class)
    @TableId("id")
    private Long id;

    @ApiModelProperty("评论内容")
    @TableField("content")
    private String content;

    @TableField("root_id")
    private Integer rootId;

    @TableField("stadium_id")
    private Integer stadiumId;

    @TableField("venue_id")
    private Integer venueId;

    @ApiModelProperty("订单号")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("评论的图片数组 最多六张")
    @TableField("pic_arr")
    private String picArr;

    @ApiModelProperty("评分 1-5分")
    @TableField("`point`")
    private Integer point;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("create_time")
    private LocalDateTime createTime;
}
