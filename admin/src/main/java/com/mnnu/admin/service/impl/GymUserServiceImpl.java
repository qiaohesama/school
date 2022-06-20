package com.mnnu.admin.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.admin.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.admin.entity.bo.GymUserPageQueryBO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymPaymentLogVO;
import com.mnnu.admin.entity.vo.GymUserVO;
import com.mnnu.admin.service.GymUserService;
import com.mnnu.common.dao.GymUserBaseMapper;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.domain.GymUserDO;
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
public class GymUserServiceImpl extends ServiceImpl<GymUserBaseMapper, GymUserDO> implements GymUserService {
    private final GymUserBaseMapper baseMapper;

    @Override
    public PageVO<GymUserVO> getPage(GymUserPageQueryBO bo) {
        LambdaQueryChainWrapper<GymUserDO> wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        Long count = wrapper
                .like(bo.getId()!=null,GymUserDO::getId,bo.getId())
                .count();
        List<GymUserDO> list = wrapper
                .like(bo.getId()!=null,GymUserDO::getId,bo.getId())
                .last(bo.limitString())
                .list();
        List<GymUserVO> voList = new ArrayList<>();
        for (GymUserDO gymUserDO : list) {
            GymUserVO vo = new GymUserVO();
            BeanUtils.copyProperties(gymUserDO, vo);
            voList.add(vo);
        }
        return bo.buildPage(voList, count);
    }

    @Override
    public void updateUserById(GymUserDTO gymUserDTO) {
        GymUserDO gymUserDo=new GymUserDO();
        BeanUtils.copyProperties(gymUserDTO,gymUserDo);
        this.updateById(gymUserDo);
    }

}
