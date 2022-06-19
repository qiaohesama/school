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
 * 评论表
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Getter
@Setter
@TableName("gym_comment")
@ApiModel(value = "GymCommentDO对象", description = "评论表")
public class GymCommentDO implements Serializable {

    private static final long serialVersionUID = 1L;

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
