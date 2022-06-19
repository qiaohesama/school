package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymManagerUserBO;
import com.mnnu.admin.entity.dto.GymManagerUserDTO;
import com.mnnu.admin.entity.vo.GymManagerUserVO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.service.GymManagerUserService;
import com.mnnu.admin.service.GymPaymentLogService;
import com.mnnu.common.dao.GymManagerUserBaseMapper;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.entity.domain.GymManagerUserDO;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class GymManagerUserServiceImpl extends ServiceImpl<GymManagerUserBaseMapper, GymManagerUserDO> implements GymManagerUserService {
    @Override
    public PageVO<GymManagerUserVO> getPage(GymManagerUserBO gymManagerUserBO) {
        LambdaQueryChainWrapper<GymManagerUserDO> wrapper = new LambdaQueryChainWrapper(baseMapper);
        Long count = wrapper.count();
        List<GymManagerUserDO> list = wrapper.last(gymManagerUserBO.limitString()).list();
        List<GymManagerUserVO> voList = new ArrayList<>();
        for (GymManagerUserDO gymManagerUserDO : list) {
            GymManagerUserVO vo = new GymManagerUserVO();
            BeanUtils.copyProperties(gymManagerUserDO, vo);
            voList.add(vo);
        }
        return gymManagerUserBO.buildPage(voList, count);
    }

    @Override
    public void updateGymManagerUseById(GymManagerUserDTO gymManagerUserDTO) {
        GymManagerUserDO gymManagerUserDO = new GymManagerUserDO();
        BeanUtils.copyProperties(gymManagerUserDTO, gymManagerUserDO);
        this.updateById(gymManagerUserDO);
    }
}