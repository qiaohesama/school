package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.dto.GymStadiumInfoDTO;
import com.mnnu.api.entity.vo.GymStadiumInfoVO;
import com.mnnu.api.entity.vo.GymUserVO;
import com.mnnu.api.service.GymStadiumInfoService;
import com.mnnu.common.dao.GymStadiumInfoBaseMapper;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymStadiumInfoServiceImpl extends ServiceImpl<GymStadiumInfoBaseMapper, GymStadiumInfoDO> implements GymStadiumInfoService {
    @Override
    public GymStadiumInfoVO getStadiumInfoById(int id) {
        GymStadiumInfoDO stadiumInfoDO = this.getById(id);
        GymStadiumInfoVO stadiumInfoVO = new GymStadiumInfoVO();
        BeanUtils.copyProperties(stadiumInfoDO, stadiumInfoVO);
        return stadiumInfoVO;
    }

    @Override
    public void updateStadiumInfo(GymStadiumInfoDTO gymStadiumInfoDTO) {
        GymStadiumInfoDO gymStadiumInfoDO=new GymStadiumInfoDO();
        BeanUtils.copyProperties(gymStadiumInfoDTO,gymStadiumInfoDO);
        this.updateById(gymStadiumInfoDO);
    }

    @Override
    public void saveStadiumInfo(GymStadiumInfoDTO gymStadiumInfoDTO) {
        GymStadiumInfoDO gymStadiumInfoDO=new GymStadiumInfoDO();
        BeanUtils.copyProperties(gymStadiumInfoDTO,gymStadiumInfoDO);
        this.save(gymStadiumInfoDO);
    }
}
