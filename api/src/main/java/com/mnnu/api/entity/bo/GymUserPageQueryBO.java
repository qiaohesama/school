package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.User;
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("场馆详细信息")
@AllArgsConstructor
@NoArgsConstructor
public class GymUserPageQueryBO extends User {

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @JsonSerialize(using = ToStringSerializer.class)
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
