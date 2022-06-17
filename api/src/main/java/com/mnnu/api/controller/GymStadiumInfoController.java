package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymStadiumInfoPageQueryBO;
import com.mnnu.api.entity.vo.GymStadiumInfoVO;
import com.mnnu.api.entity.vo.GymStadiumVO;
import com.mnnu.api.service.GymStadiumInfoService;
import com.mnnu.api.service.GymStadiumService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/stadiumInfo")
@AllArgsConstructor
@Api(tags = "体育馆详情控制器")
public class GymStadiumInfoController {
    private final GymStadiumInfoService gymStadiumInfoService;
    @ApiOperation("管理员通过id获得体育馆具体信息")
    @GetMapping("/{id}")
    public R<GymStadiumInfoVO> getPage(@PathVariable int id) {
        return R.data(gymStadiumInfoService.getStadiumInfoById(id));
    }
}
