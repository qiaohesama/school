package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.vo.GymVenueVO;
import com.mnnu.common.entity.domain.GymVenueDO;

import java.util.List;

public interface GymVenueService  extends IService<GymVenueDO> {
    List<GymVenueVO> getVenueByStadiumId(int id);
}
