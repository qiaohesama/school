package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymStadiumInfoPageQueryBO;
import com.mnnu.api.entity.dto.GymStadiumInfoDTO;
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
@Api(tags = "体育馆详情信息")
public class GymStadiumInfoController {
    private final GymStadiumInfoService gymStadiumInfoService;

    @ApiOperation("管理员通过id获得体育馆具体信息")
    @GetMapping("/{id}")
    public R<GymStadiumInfoVO> getPage(@PathVariable Integer id) {
        return R.data(gymStadiumInfoService.getStadiumInfoById(id));
    }

    @ApiOperation("更新体育馆")
    @PostMapping("/update")
    public R<Void> update(@RequestBody GymStadiumInfoDTO gymStadiumInfoDTO) {
        gymStadiumInfoService.updateStadiumInfo(gymStadiumInfoDTO);
        return R.success();
    }

    @ApiOperation("新增一条体育馆信息(绑定申请体育馆)")
    @PostMapping("/save")
    public R<Void> save(@RequestBody GymStadiumInfoDTO gymStadiumInfoDTO) {
        gymStadiumInfoService.saveStadiumInfo(gymStadiumInfoDTO);
        return R.success();
    }
}
