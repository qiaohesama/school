package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymReservePageQueryBO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.entity.vo.GymVenueVO;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.vo.PageVO;

import java.util.List;

public interface GymReserveService extends IService<GymReserveDO> {
    PageVO<GymReserveVO> getPage(GymReservePageQueryBO gymReservePageQueryBO);

    void updateByReserveId(GymUserDTO gymUserDTO);

    List<GymReserveVO> getDetailById(Integer id);
}
