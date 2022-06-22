package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymVenueDO;

import java.util.List;

public interface GymVenueService  extends IService<GymVenueDO> {
    List<GymVenueVO> getVenueById(int id);

}
