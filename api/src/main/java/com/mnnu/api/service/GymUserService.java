package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.bo.GymUserPageQueryBO;
import com.mnnu.api.entity.dto.GymUserDTO;
import com.mnnu.api.entity.vo.GymUserVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymUserDO;

public interface GymUserService  extends IService<GymUserDO> {
    GymUserVO getByUserId(int id);

    void updateByUserId(GymUserDTO gymUserDTO);

    void saveUser(GymUserDTO gymUserDTO);

    GymUserDO login(GymUserPageQueryBO gymUserPageQueryBO);

    GymUserDO register(GymUserPageQueryBO gymUserPageQueryBO);
}
