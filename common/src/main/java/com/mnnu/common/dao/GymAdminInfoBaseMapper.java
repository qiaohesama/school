package com.mnnu.common.dao;

import com.mnnu.common.entity.domain.GymAdminInfoDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 普通用户申请成为场馆管理员需要缴交的材料 Mapper 接口
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Mapper
public interface GymAdminInfoBaseMapper extends BaseMapper<GymAdminInfoDO> {

}
