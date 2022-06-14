package com.mnnu.api.entity.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mnnu.common.entity.bo.BasePageQueryBO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@ApiModel("yenianvj")
@EqualsAndHashCode(callSuper = true)
public class DemoPageQueryBO extends BasePageQueryBO {
    private static final long serialVersionUID = 1L;


}
