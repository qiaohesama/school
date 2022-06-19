package com.mnnu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mnnu.admin.entity.bo.GymManagerUserBO;
import com.mnnu.admin.entity.dto.GymManagerUserDTO;
import com.mnnu.admin.entity.vo.GymManagerUserVO;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymManagerUserDO;
import com.mnnu.common.entity.domain.GymPaymentLogDO;
import com.mnnu.common.entity.vo.PageVO;

public interface GymManagerUserService extends IService<GymManagerUserDO> {
    PageVO<GymManagerUserVO> getPage(GymManagerUserBO gymManagerUserBO);
    void updateGymManagerUseById(GymManagerUserDTO gymManagerUserDTO);

    void saveManagerUser(GymManagerUserDTO gymManagerUserDTO);
}
