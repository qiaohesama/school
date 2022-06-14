package com.mnnu.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.api.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymPaymentLogService extends IService<GymPaymentLogDO> {
    PageVO<GymPaymentLogVO> getPage(GymPaymentLogPageQueryBO gymPaymentLogPageQueryBO);
}
