package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymStadiumInfoPageQueryBO;
import com.mnnu.api.entity.vo.GymStadiumInfoVO;
import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.api.service.GymUserRoleRelationService;
import com.mnnu.api.service.GymVenueService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;
import com.mnnu.common.entity.domain.GymVenueDO;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/venue")
@AllArgsConstructor
@Api(tags = "体育场地点控制器")
public class GymVenueController {
    private final GymVenueService gymVenueService;
    @GetMapping("/{id}")
    public R<GymVenueVO> getByStadiumId(@PathVariable int id) {
        return R.data(gymVenueService.getVenueById(id));
    }
}
