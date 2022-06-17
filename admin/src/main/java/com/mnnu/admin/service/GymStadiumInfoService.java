package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.vo.GymStadiumInfoVO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;

import java.util.List;

public interface GymStadiumInfoService extends IService<GymStadiumInfoDO> {
    GymStadiumInfoVO getStadiumInfoById(Integer id);

    List<GymStadiumInfoVO> getStadiumInfoDetail(Integer id);
}
