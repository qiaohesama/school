package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumDTO;
import com.mnnu.admin.entity.vo.GymStadiumVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymStadiumService  extends IService<GymStadiumDO> {
    PageVO<GymStadiumVO> getPage(GymStadiumPageQueryBO bo);

    void updateByStadiumId(GymStadiumDTO gymStadiumDTO);
}
