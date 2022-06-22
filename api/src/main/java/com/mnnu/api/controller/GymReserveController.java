package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymReservePageQueryBO;
import com.mnnu.api.entity.bo.GymUserPageQueryBO;
import com.mnnu.api.entity.dto.GymReserveDTO;
import com.mnnu.api.entity.vo.GymReserveVO;
import com.mnnu.api.service.GymReserveService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import com.mnnu.common.entity.domain.GymUserDO;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/reserve")
@AllArgsConstructor
@Api(tags = "订单")
public class GymReserveController {
    private final GymReserveService gymReserveService;

    @ApiOperation("管理员获得订单信息列表")
    @GetMapping("/getPage")
    public R<PageVO<GymReserveVO>> getPage(@ModelAttribute GymReservePageQueryBO gymReservePageQueryBO) {
        return R.data(gymReserveService.getPage(gymReservePageQueryBO));
    }

    @ApiOperation("新增一条订单")
    @PostMapping("/save")
    public R<Boolean> save(@RequestBody GymReserveDTO gymReserveDTO) {
        return R.data(gymReserveService.saveGymReserve(gymReserveDTO));
    }

    @ApiOperation("用户获得自身的订单")
    @GetMapping("/getPage/userId")
    public R<PageVO<GymReserveVO>> getUserPage(@ModelAttribute GymReservePageQueryBO gymReservePageQueryBO) {
        return R.data(gymReserveService.listByUserId(gymReservePageQueryBO));
    }
}
