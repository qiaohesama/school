package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymAdminInfoBO;
import com.mnnu.admin.entity.vo.GymAdminInfoVO;
import com.mnnu.common.entity.domain.GymAdminInfoDO;
import com.mnnu.common.entity.domain.GymCommentDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymAdminInfoService extends IService<GymAdminInfoDO> {
    PageVO<GymAdminInfoVO> getPage(GymAdminInfoBO gymAdminInfoBO);
}
