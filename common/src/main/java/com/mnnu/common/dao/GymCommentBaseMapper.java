package com.mnnu.common.dao;

import com.mnnu.common.entity.domain.GymCommentDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author qiaohe
 * @since 2022-06-18
 */
@Mapper
public interface GymCommentBaseMapper extends BaseMapper<GymCommentDO> {

}
