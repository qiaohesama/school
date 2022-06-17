package com.mnnu.common.dao;

import com.mnnu.common.entity.domain.GymUserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 前台用户表 Mapper 接口
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-16
 */
@Mapper
public interface GymUserBaseMapper extends BaseMapper<GymUserDO> {

}
