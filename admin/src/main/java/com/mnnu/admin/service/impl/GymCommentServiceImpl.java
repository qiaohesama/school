package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymCommentPageQueryBO;
import com.mnnu.admin.entity.vo.GymCommentVO;
import com.mnnu.admin.service.GymCommentService;
import com.mnnu.common.dao.GymCommentBaseMapper;
import com.mnnu.common.entity.domain.GymCommentDO;
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
public class GymCommentServiceImpl extends ServiceImpl<GymCommentBaseMapper, GymCommentDO> implements GymCommentService {
    @Override
    public PageVO<GymCommentVO> getPage(GymCommentPageQueryBO bo) {
        LambdaQueryChainWrapper<GymCommentDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper.count();
        List<GymCommentDO> list = wrapper.last(bo.limitString()).list();
        List<GymCommentVO> voList = new ArrayList<>();
        for (GymCommentDO gymCommentDO : list) {
            GymCommentVO vo = new GymCommentVO();
            BeanUtils.copyProperties(gymCommentDO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

    @Override
    public List<GymCommentVO> getDetailById(Integer id) {
        QueryWrapper<GymCommentDO> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        GymCommentDO gymCommentDO = this.getOne(wrapper);
        GymCommentVO gymCommentVO = new GymCommentVO();
        BeanUtils.copyProperties(gymCommentDO,gymCommentVO);
        List<GymCommentVO> list=new ArrayList<>();
        list.add(gymCommentVO);
        return list;
    }
}
