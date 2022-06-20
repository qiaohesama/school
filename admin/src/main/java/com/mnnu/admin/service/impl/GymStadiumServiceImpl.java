package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumDTO;
import com.mnnu.admin.entity.vo.GymStadiumVO;
import com.mnnu.admin.service.GymStadiumService;
import com.mnnu.common.dao.GymStadiumBaseMapper;
import com.mnnu.common.entity.domain.GymStadiumDO;
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
public class GymStadiumServiceImpl extends ServiceImpl<GymStadiumBaseMapper, GymStadiumDO> implements GymStadiumService {
    @Override
    public PageVO<GymStadiumVO> getPage(GymStadiumPageQueryBO bo) {
        LambdaQueryChainWrapper<GymStadiumDO> wrapper = new LambdaQueryChainWrapper(baseMapper);
        Long count = wrapper.like(bo.getId()!=null,GymStadiumDO::getId,bo.getId()).count();
        List<GymStadiumDO> list = wrapper
                .like(bo.getId()!=null,GymStadiumDO::getId,bo.getId())
                .last(bo.limitString())
                .list();
        List<GymStadiumVO> voList = new ArrayList<>();
        for (GymStadiumDO gymStadiumDO : list) {
            GymStadiumVO vo = new GymStadiumVO();
            BeanUtils.copyProperties(gymStadiumDO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

    @Override
    public void updateByStadiumId(GymStadiumDTO gymStadiumDTO) {
        GymStadiumDO gymStadiumDO=new GymStadiumDO();
        BeanUtils.copyProperties(gymStadiumDTO,gymStadiumDO);
        this.updateById(gymStadiumDO);
    }
}
