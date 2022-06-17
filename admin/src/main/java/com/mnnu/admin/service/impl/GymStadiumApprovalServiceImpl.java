package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymStadiumApprovalPageQueryBO;
import com.mnnu.admin.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.admin.entity.vo.GymStadiumApprovalVO;
import com.mnnu.admin.entity.vo.GymStadiumVO;
import com.mnnu.admin.service.GymStadiumApprovalService;
import com.mnnu.common.dao.GymStadiumApprovalBaseMapper;
import com.mnnu.common.entity.domain.GymStadiumApprovalDO;
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
public class GymStadiumApprovalServiceImpl extends ServiceImpl<GymStadiumApprovalBaseMapper, GymStadiumApprovalDO> implements GymStadiumApprovalService {
    @Override
    public PageVO<GymStadiumApprovalVO> getPage(GymStadiumApprovalPageQueryBO bo) {
        LambdaQueryChainWrapper<GymStadiumApprovalDO> wrapper = new LambdaQueryChainWrapper(baseMapper);
        Long count = wrapper.count();
        List<GymStadiumApprovalDO> list = wrapper.last(bo.limitString()).list();
        List<GymStadiumApprovalVO> voList = new ArrayList<>();
        for (GymStadiumApprovalDO gymStadiumApprovaldO : list) {
            GymStadiumApprovalVO vo = new GymStadiumApprovalVO();
            BeanUtils.copyProperties(gymStadiumApprovaldO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

    @Override
    public void updateStadiumApprovalById(GymStadiumApprovalDTO gymStadiumApprovalDTO) {
        GymStadiumApprovalDO gymStadiumApprovalDO=new GymStadiumApprovalDO();
        BeanUtils.copyProperties(gymStadiumApprovalDTO,gymStadiumApprovalDO);
        this.updateById(gymStadiumApprovalDO);
    }

}
