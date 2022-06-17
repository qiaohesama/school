package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.admin.entity.vo.GymPaymentLogVO;
import com.mnnu.admin.service.GymPaymentLogService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/paymentLog")
@AllArgsConstructor
@Api(tags = "支付日志控制器")
public class GymPaymentLogController {

    private final GymPaymentLogService gymPaymentLogService;

    @ApiOperation("获得支付日志")
    @GetMapping("/getPage")
    public R<PageVO<GymPaymentLogVO>> getPage(@ModelAttribute GymPaymentLogPageQueryBO gymPaymentLogPageQueryBO) {
        return R.data(gymPaymentLogService.getPage(gymPaymentLogPageQueryBO));
    }


}

