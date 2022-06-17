package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.dto.GymUserRoleRelationDTO;
import com.mnnu.admin.service.GymUserRoleRelationService;
import com.mnnu.common.dao.GymUserRoleRelationBaseMapper;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymUserRoleRelationImpl extends ServiceImpl<GymUserRoleRelationBaseMapper, GymUserRoleRelationDO> implements GymUserRoleRelationService {

    @Override
    public void saveUserRoleRelation(GymUserRoleRelationDTO gymUserRoleRelationDTO) {
        GymUserRoleRelationDO gymUserRoleRelationDO=new GymUserRoleRelationDO();
        BeanUtils.copyProperties(gymUserRoleRelationDTO,gymUserRoleRelationDO);
        this.save(gymUserRoleRelationDO);
    }

    @Override
    public void updateByUserRoleRelationId(GymUserRoleRelationDTO gymUserRoleRelationDTO) {
        GymUserRoleRelationDO gymUserRoleRelationDO=new GymUserRoleRelationDO();
        BeanUtils.copyProperties(gymUserRoleRelationDTO,gymUserRoleRelationDO);
        this.updateById(gymUserRoleRelationDO);
    }
}
