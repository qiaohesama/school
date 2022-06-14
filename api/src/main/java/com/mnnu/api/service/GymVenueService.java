package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymVenueDO;

public interface GymVenueService  extends IService<GymVenueDO> {
    GymVenueVO getVenueById(int id);
}
