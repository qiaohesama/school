package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymCommentPageQueryBO;
import com.mnnu.admin.entity.vo.GymCommentVO;
import com.mnnu.common.entity.domain.GymCommentDO;
import com.mnnu.common.entity.vo.PageVO;

import java.util.List;

public interface GymCommentService extends IService<GymCommentDO> {
    PageVO<GymCommentVO> getPage(GymCommentPageQueryBO bo);

    List<GymCommentVO> getDetailById(Integer id);
}
