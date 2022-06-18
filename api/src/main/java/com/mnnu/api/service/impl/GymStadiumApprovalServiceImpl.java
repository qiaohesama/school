package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.api.service.GymStadiumApprovalService;
import com.mnnu.common.dao.GymStadiumApprovalBaseMapper;
import com.mnnu.common.entity.domain.GymStadiumApprovalDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class GymStadiumApprovalServiceImpl extends ServiceImpl<GymStadiumApprovalBaseMapper, GymStadiumApprovalDO> implements GymStadiumApprovalService {

    @Override
    public void saveStadiumApproval(GymStadiumApprovalDTO gymStadiumApprovalDTO) {
        GymStadiumApprovalDO gymStadiumApprovalDO=new GymStadiumApprovalDO();
        BeanUtils.copyProperties(gymStadiumApprovalDTO,gymStadiumApprovalDTO);
        this.save(gymStadiumApprovalDO);
    }
}
