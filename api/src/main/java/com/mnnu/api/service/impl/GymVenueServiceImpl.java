package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.api.service.GymVenueService;
import com.mnnu.common.dao.GymVenueBaseMapper;
import com.mnnu.common.entity.domain.GymVenueDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymVenueServiceImpl  extends ServiceImpl<GymVenueBaseMapper, GymVenueDO> implements GymVenueService {
    @Override
    public GymVenueVO getVenueById(int id) {
        GymVenueDO gymVenueDO = this.getById(id);
        GymVenueVO gymVenueVO=new GymVenueVO();
        BeanUtils.copyProperties(gymVenueDO, gymVenueVO);
        return gymVenueVO;
    }
}
