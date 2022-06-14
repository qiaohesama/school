package com.mnnu.common.dao;

import com.mnnu.common.entity.domain.GymStadiumDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-13
 */
@Mapper
@Repository
public interface GymStadiumBaseMapper extends BaseMapper<GymStadiumDO> {

}
