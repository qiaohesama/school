package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.bo.GymReservePageQueryBO;
import com.mnnu.api.entity.bo.GymUserPageQueryBO;
import com.mnnu.api.entity.dto.GymReserveDTO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.api.service.GymReserveService;
import com.mnnu.api.service.GymVenueService;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.dao.GymReserveBaseMapper;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.domain.GymVenueDO;
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
    GymVenueService gymVenueService;
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
    public Boolean saveGymReserve(GymReserveDTO gymReserveDTO) {
        GymReserveDO gymReserveDO = new GymReserveDO();
        BeanUtils.copyProperties(gymReserveDTO, gymReserveDO);
        QueryWrapper<GymReserveDO> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", gymReserveDO.getUserId())
                .eq("venue_id", gymReserveDO.getVenueId());
        GymReserveDO one = this.getOne(wrapper);
        if (one == null) {
            this.save(gymReserveDO);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public PageVO<GymReserveVO> listByUserId(GymReservePageQueryBO gymReservePageQueryBO) {
        LambdaQueryChainWrapper<GymReserveDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymReserveDO> list = wrapper.eq(GymReserveDO::getUserId, gymReservePageQueryBO.getUserId()).last(gymReservePageQueryBO.limitString()).list();
        List<GymReserveVO> voList = new ArrayList<>();
        for (GymReserveDO gymReserveDO : list) {
            GymReserveVO vo = new GymReserveVO();
            BeanUtils.copyProperties(gymReserveDO, vo);
            GymVenueDO gymVenueDO = gymVenueService.getById(gymReserveDO.getVenueId());
            vo.setVenueName(gymVenueDO.getName());
            vo.setLimitCount(gymVenueDO.getLimitCount());
            voList.add(vo);
        }
        return gymReservePageQueryBO.buildPage(voList, count);
    }
}
