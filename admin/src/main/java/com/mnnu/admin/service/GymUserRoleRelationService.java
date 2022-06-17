package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.dto.GymUserRoleRelationDTO;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;

public interface GymUserRoleRelationService extends IService<GymUserRoleRelationDO> {
    void saveUserRoleRelation(GymUserRoleRelationDTO gymUserRoleRelationDTO);

    void updateByUserRoleRelationId(GymUserRoleRelationDTO gymUserRoleRelationDTO);
}
