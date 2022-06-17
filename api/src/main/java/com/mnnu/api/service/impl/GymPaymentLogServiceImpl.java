package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.service.GymPaymentLogService;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
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
public class GymPaymentLogServiceImpl extends ServiceImpl<GymPaymentLogBaseMapper, GymPaymentLogDO> implements GymPaymentLogService {
    private final GymPaymentLogBaseMapper baseMapper;

    @Override
    public PageVO<GymPaymentLogVO> getPage(GymPaymentLogPageQueryBO gymPaymentLogPageQueryBO) {
        LambdaQueryChainWrapper<GymPaymentLogDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymPaymentLogDO> list = wrapper.last(gymPaymentLogPageQueryBO.limitString()).list();
        List<GymPaymentLogVO> voList = new ArrayList<>();
        for (GymPaymentLogDO gymPaymentLogDO : list) {
            GymPaymentLogVO vo = new GymPaymentLogVO();
            BeanUtils.copyProperties(gymPaymentLogDO, vo);
            voList.add(vo);
        }
        return gymPaymentLogPageQueryBO.buildPage(voList, count);
    }
}
