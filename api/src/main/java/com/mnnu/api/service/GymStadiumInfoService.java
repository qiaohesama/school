package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.dto.GymStadiumInfoDTO;
import com.mnnu.api.entity.vo.GymStadiumInfoVO;
import com.mnnu.api.entity.vo.GymUserVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;

public interface GymStadiumInfoService extends IService<GymStadiumInfoDO> {
    GymStadiumInfoVO getStadiumInfoById(int id);

    void updateStadiumInfo(GymStadiumInfoDTO gymStadiumInfoDTO);

    void saveStadiumInfo(GymStadiumInfoDTO gymStadiumInfoDTO);
}
