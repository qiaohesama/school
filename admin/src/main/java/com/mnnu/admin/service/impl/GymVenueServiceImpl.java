package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.vo.GymCommentVO;
import com.mnnu.admin.entity.vo.GymVenueVO;
import com.mnnu.admin.service.GymVenueService;
import com.mnnu.common.dao.GymVenueBaseMapper;
import com.mnnu.common.entity.domain.GymCommentDO;
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

    @Override
    public List<GymVenueVO> getVenueByStadiumId(int id) {
        QueryWrapper<GymVenueDO> wrapper = new QueryWrapper<>();
        wrapper.eq("stadium_id", id);
        List<GymVenueDO> list = this.list(wrapper);
        List<GymVenueVO> voList = new ArrayList<>();
        for (GymVenueDO gymVenueDO : list) {
            GymVenueVO vo = new GymVenueVO();
            BeanUtils.copyProperties(gymVenueDO, vo);
            voList.add(vo);
        }
        return voList;
    }
}
