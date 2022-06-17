package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymAdminInfoBO;
import com.mnnu.admin.entity.vo.GymAdminInfoVO;
import com.mnnu.admin.service.GymAdminInfoService;
import com.mnnu.common.dao.GymAdminInfoBaseMapper;
import com.mnnu.common.entity.domain.GymAdminInfoDO;
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
public class GymAdminInfoServiceImpl  extends ServiceImpl<GymAdminInfoBaseMapper, GymAdminInfoDO> implements GymAdminInfoService {
    @Override
    public PageVO<GymAdminInfoVO> getPage(GymAdminInfoBO gymAdminInfoBO) {
        LambdaQueryChainWrapper<GymAdminInfoDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymAdminInfoDO> list = wrapper.last(gymAdminInfoBO.limitString()).list();
        List<GymAdminInfoVO> voList = new ArrayList<>();
        for (GymAdminInfoDO gymAdminInfoDO : list) {
            GymAdminInfoVO vo = new GymAdminInfoVO();
            BeanUtils.copyProperties(gymAdminInfoDO, vo);
            voList.add(vo);
        }
        return gymAdminInfoBO.buildPage(voList, count);
    }
}
