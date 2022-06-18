package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.mnnu.api.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.common.entity.domain.GymStadiumApprovalDO;

public interface GymStadiumApprovalService extends IService<GymStadiumApprovalDO> {
    void saveStadiumApproval(GymStadiumApprovalDTO gymStadiumApprovalDTO);
}
