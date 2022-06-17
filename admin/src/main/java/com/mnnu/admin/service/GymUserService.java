package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymUserPageQueryBO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymUserVO;
import com.mnnu.common.entity.domain.GymUserDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymUserService  extends IService<GymUserDO> {

    PageVO<GymUserVO> getPage(GymUserPageQueryBO bo);

    void updateUserById(GymUserDTO gymUserDTO);
}
