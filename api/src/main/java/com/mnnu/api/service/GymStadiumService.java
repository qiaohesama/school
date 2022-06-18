package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.bo.GymReservePageQueryBO;
import com.mnnu.api.entity.bo.GymStadiumInfoPageQueryBO;
import com.mnnu.api.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.api.entity.vo.GymStadiumVO;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymStadiumService  extends IService<GymStadiumDO> {
    PageVO<GymStadiumVO> getPage(GymStadiumPageQueryBO bo);

}
