package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.bo.GymReservePageQueryBO;
import com.mnnu.api.entity.dto.GymReserveDTO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.api.service.GymReserveService;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.dao.GymReserveBaseMapper;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GymReserveServiceImpl extends ServiceImpl<GymReserveBaseMapper, GymReserveDO> implements GymReserveService {

    private final GymReserveBaseMapper baseMapper;
    @Override
    public PageVO<GymReserveVO> getPage(GymReservePageQueryBO gymReservePageQueryBO) {
        LambdaQueryChainWrapper<GymReserveDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymReserveDO> list = wrapper.last(gymReservePageQueryBO.limitString()).list();
        List<GymReserveVO> voList = new ArrayList<>();
        for (GymReserveDO gymReserveDO : list) {
            GymReserveVO vo = new GymReserveVO();
            BeanUtils.copyProperties(gymReserveDO, vo);
            voList.add(vo);
        }
        return gymReservePageQueryBO.buildPage(voList, count);
    }

    @Override
    public void saveGymReserve(GymReserveDTO gymReserveDTO) {
        GymReserveDO gymReserveDO=new GymReserveDO();
        BeanUtils.copyProperties(gymReserveDTO,gymReserveDO);
        this.save(gymReserveDO);
    }
}
