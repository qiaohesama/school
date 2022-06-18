package com.mnnu.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mnnu.api.entity.dto.GymUserDTO;
import com.mnnu.api.entity.vo.GymUserVO;
import com.mnnu.api.service.GymUserService;
import com.mnnu.common.dao.GymUserBaseMapper;
import com.mnnu.common.entity.domain.GymUserDO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GymUserServiceImpl extends ServiceImpl<GymUserBaseMapper, GymUserDO> implements GymUserService {
    @Override
    public GymUserVO getByUserId(int id) {
        GymUserDO userDO = this.getById(id);
        GymUserVO userVO = new GymUserVO();
        BeanUtils.copyProperties(userDO, userVO);
        return userVO;
    }

    @Override
    public void updateByUserId(GymUserDTO gymUserDTO) {
        GymUserDO userDO = new GymUserDO();
        BeanUtils.copyProperties(gymUserDTO, userDO);
        this.updateById(userDO);
    }

    @Override
    public void saveUser(GymUserDTO gymUserDTO) {
        GymUserDO gymUserDO = new GymUserDO();
        BeanUtils.copyProperties(gymUserDTO, gymUserDO);
        this.save(gymUserDO);
    }
}
