package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.admin.entity.vo.GymPaymentLogVO;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymPaymentLogService extends IService<GymPaymentLogDO> {
    PageVO<GymPaymentLogVO> getPage(GymPaymentLogPageQueryBO gymPaymentLogPageQueryBO);
}
