package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.bo.GymCommentPageQueryBO;
import com.mnnu.api.entity.dto.GymCommentDTO;
import com.mnnu.api.entity.vo.GymCommentVO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.service.GymCommentService;
import com.mnnu.api.service.GymPaymentLogService;
import com.mnnu.common.dao.GymCommentBaseMapper;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.entity.domain.GymCommentDO;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.vo.PageVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class GymCommentServiceImpl extends ServiceImpl<GymCommentBaseMapper, GymCommentDO> implements GymCommentService {
    @Override
    public PageVO<GymCommentVO> getPage(GymCommentPageQueryBO bo) {
        LambdaQueryChainWrapper<GymCommentDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymCommentDO> list = wrapper
                .eq(GymCommentDO::getStadiumId,bo.getStadiumId())
                .last(bo.limitString()).list();
        List<GymCommentVO> voList = new ArrayList<>();
        for (GymCommentDO gymCommentDO : list) {
            GymCommentVO vo = new GymCommentVO();
            BeanUtils.copyProperties(gymCommentDO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

    @Override
    public void saveComment(GymCommentDTO gymCommentDTO) {
        GymCommentDO gymCommentDO=new GymCommentDO();
        BeanUtils.copyProperties(gymCommentDTO,gymCommentDO);
        this.save(gymCommentDO);
    }

    @Override
    public Long countByStadiumId(Integer id) {
        QueryWrapper<GymCommentDO> wrapper=new QueryWrapper<>();
        wrapper.eq("stadium_id",id);
        return this.count(wrapper);
    }

    @Override
    public Long countByVenueId(Integer id) {
        QueryWrapper<GymCommentDO> wrapper=new QueryWrapper<>();
        wrapper.eq("venue_id",id);
        return this.count(wrapper);
    }
}
