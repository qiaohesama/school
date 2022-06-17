package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.service.GymPaymentLogService;
import com.mnnu.common.common.R;
import com.mnnu.common.dao.GymPaymentLogBaseMapper;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/gymPaymentLog")
@AllArgsConstructor
@Api(tags = "支付日志控制器")
public class GymPaymentLogController {

    private final GymPaymentLogService gymPaymentLogService;

    @ApiOperation("管理员获得支付日志列表")
    @GetMapping("/getPage")
    public R<PageVO<GymPaymentLogVO>> getPage(@ModelAttribute GymPaymentLogPageQueryBO gymPaymentLogPageQueryBO) {
        return R.data(gymPaymentLogService.getPage(gymPaymentLogPageQueryBO));
    }


}

