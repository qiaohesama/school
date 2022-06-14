package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.service.GymUserRoleRelationService;
import com.mnnu.common.dao.GymUserRoleRelationBaseMapper;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymUserRoleRelationImpl extends ServiceImpl<GymUserRoleRelationBaseMapper, GymUserRoleRelationDO> implements GymUserRoleRelationService {
}
