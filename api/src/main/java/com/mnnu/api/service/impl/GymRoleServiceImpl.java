package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.service.GymRoleService;
import com.mnnu.common.dao.GymRoleBaseMapper;
import com.mnnu.common.entity.domain.GymRoleDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymRoleServiceImpl extends ServiceImpl<GymRoleBaseMapper, GymRoleDO> implements GymRoleService {
}
