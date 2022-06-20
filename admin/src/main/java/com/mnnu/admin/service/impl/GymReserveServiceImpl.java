package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymReservePageQueryBO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.entity.vo.GymVenueVO;
import com.mnnu.admin.service.GymReserveService;
import com.mnnu.common.dao.GymReserveBaseMapper;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
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
        LambdaQueryChainWrapper<GymReserveDO> wrapper = new LambdaQueryChainWrapper(baseMapper);
        Long count = wrapper
                .like(gymReservePageQueryBO!=null,GymReserveDO::getOrderId,gymReservePageQueryBO.getOrderId())
                .count();
        List<GymReserveDO> list = wrapper
                .like(gymReservePageQueryBO!=null,GymReserveDO::getOrderId,gymReservePageQueryBO.getOrderId())
                .last(gymReservePageQueryBO.limitString())
                .list();
        List<GymReserveVO> voList = new ArrayList<>();
        for (GymReserveDO gymReserveDO : list) {
            GymReserveVO vo = new GymReserveVO();
            BeanUtils.copyProperties(gymReserveDO, vo);
            voList.add(vo);
        }
        return gymReservePageQueryBO.buildPage(voList, count);
    }

    @Override
    public void updateByReserveId(GymUserDTO gymUserDTO) {
        GymReserveDO gymReserveDO=new GymReserveDO();
        BeanUtils.copyProperties(gymUserDTO,gymReserveDO);
        this.updateById(gymReserveDO);
    }

    @Override
    public List<GymReserveVO> getDetailById(Integer id) {
        QueryWrapper<GymReserveDO> wrapper=new QueryWrapper<>();
        wrapper.eq("order_id",id);
        GymReserveDO gymReserveDO = this.getOne(wrapper);
        GymReserveVO gymReserveVO=new GymReserveVO();
        BeanUtils.copyProperties(gymReserveDO,gymReserveVO);
        List<GymReserveVO> list=new ArrayList<GymReserveVO>();
        list.add(gymReserveVO);
        return list;
    }
}
