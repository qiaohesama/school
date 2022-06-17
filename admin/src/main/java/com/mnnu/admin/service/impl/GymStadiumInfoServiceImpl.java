package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.entity.vo.GymStadiumInfoVO;
import com.mnnu.admin.service.GymStadiumInfoService;
import com.mnnu.common.dao.GymStadiumInfoBaseMapper;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GymStadiumInfoServiceImpl extends ServiceImpl<GymStadiumInfoBaseMapper, GymStadiumInfoDO> implements GymStadiumInfoService {
    @Override
    public GymStadiumInfoVO getStadiumInfoById(Integer id) {
        GymStadiumInfoDO stadiumInfoDO = this.getById(id);
        GymStadiumInfoVO stadiumInfoVO = new GymStadiumInfoVO();
        BeanUtils.copyProperties(stadiumInfoDO, stadiumInfoVO);
        return stadiumInfoVO;
    }

    @Override
    public List<GymStadiumInfoVO> getStadiumInfoDetail(Integer id) {
        QueryWrapper<GymStadiumInfoDO> wrapper = new QueryWrapper<>();
        wrapper.eq("stadium_id", id);
        GymStadiumInfoDO gymStadiumInfoDO = this.getOne(wrapper);
        GymStadiumInfoVO gymStadiumInfoVO = new GymStadiumInfoVO();
        BeanUtils.copyProperties(gymStadiumInfoDO, gymStadiumInfoVO);
        List<GymStadiumInfoVO> list = new ArrayList<>();
        list.add(gymStadiumInfoVO);
        return list;
    }
}
