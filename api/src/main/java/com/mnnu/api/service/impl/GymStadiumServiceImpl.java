package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.api.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.api.entity.vo.GymStadiumVO;
import com.mnnu.api.service.GymStadiumService;
import com.mnnu.common.dao.GymStadiumBaseMapper;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GymStadiumServiceImpl extends ServiceImpl<GymStadiumBaseMapper, GymStadiumDO> implements GymStadiumService {
    @Override
    public PageVO<GymStadiumVO> getPage(GymStadiumPageQueryBO bo) {
        LambdaQueryChainWrapper<GymStadiumDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymStadiumDO> list = wrapper.like(Strings.isNotEmpty(bo.getName()),GymStadiumDO::getName,bo.getName()).last(bo.limitString()).list();
        List<GymStadiumVO> voList = new ArrayList<>();
        for (GymStadiumDO gymStadiumDO : list) {
            GymStadiumVO vo = new GymStadiumVO();
            BeanUtils.copyProperties(gymStadiumDO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

}
