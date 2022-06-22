package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.bo.GymReservePageQueryBO;
import com.mnnu.api.entity.bo.GymUserPageQueryBO;
import com.mnnu.api.entity.dto.GymReserveDTO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymReserveService extends IService<GymReserveDO> {
    PageVO<GymReserveVO> getPage(GymReservePageQueryBO gymReservePageQueryBO);

    Boolean saveGymReserve(GymReserveDTO gymReserveDTO);

    PageVO<GymReserveVO> listByUserId(GymReservePageQueryBO gymReservePageQueryBO);
}
