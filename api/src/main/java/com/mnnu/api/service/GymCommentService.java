package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.bo.GymCommentPageQueryBO;
import com.mnnu.api.entity.dto.GymCommentDTO;
import com.mnnu.api.entity.vo.GymCommentVO;
import com.mnnu.common.entity.domain.GymCommentDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymCommentService extends IService<GymCommentDO> {
    PageVO<GymCommentVO> getPage(GymCommentPageQueryBO bo);

    void saveComment(GymCommentDTO gymCommentDTO);

    Long countByVenueId(Integer id);

    Long countByStadiumId(Integer id);
}
