package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@ApiModel("yenianvj")
@EqualsAndHashCode(callSuper = true)
@ToString
public class GymCommentPageQueryBO extends BasePageQueryBO {
    @TableField("stadium_id")
    private Integer stadiumId;

    @ApiModelProperty("评论内容")
    @TableField("content")
    private String content;


    @ApiModelProperty("评论的图片数组 最多六张")
    @TableField("pic_arr")
    private String picArr;

    @ApiModelProperty("评分 1-5分")
    @TableField("`point`")
    private Integer point;


    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @TableField("create_time")
    private LocalDateTime createTime;

}
