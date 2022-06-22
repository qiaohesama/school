package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.api.service.GymCommentService;
import com.mnnu.api.service.GymVenueService;
import com.mnnu.common.dao.GymVenueBaseMapper;
import com.mnnu.common.entity.domain.GymVenueDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GymVenueServiceImpl extends ServiceImpl<GymVenueBaseMapper, GymVenueDO> implements GymVenueService {
    GymCommentService gymCommentService;

    @Override
    public List<GymVenueVO> getVenueById(int id) {
        QueryWrapper<GymVenueDO> wrapper = new QueryWrapper<>();
        wrapper.eq("stadium_id", id);
        List<GymVenueDO> list = this.list(wrapper);
        List<GymVenueVO> listVo = new ArrayList<>();
        for (GymVenueDO gymVenueDO : list) {
            GymVenueVO gymVenueVO = new GymVenueVO();
            gymVenueVO.setCommentNum(gymCommentService.countByVenueId(gymVenueVO.getId()));
            BeanUtils.copyProperties(gymVenueDO, gymVenueVO);
            listVo.add(gymVenueVO);
        }
        return listVo;
    }
}
