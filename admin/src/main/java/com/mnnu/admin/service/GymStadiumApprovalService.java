package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymStadiumApprovalPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.admin.entity.vo.GymStadiumApprovalVO;
import com.mnnu.common.entity.domain.GymStadiumApprovalDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymStadiumApprovalService extends IService<GymStadiumApprovalDO> {
    PageVO<GymStadiumApprovalVO> getPage(GymStadiumApprovalPageQueryBO bo);

    void updateStadiumApprovalById(GymStadiumApprovalDTO gymStadiumApprovalDTO);
}
