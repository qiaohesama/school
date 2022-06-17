package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymReservePageQueryBO;
import com.mnnu.admin.entity.dto.GymReserveDTO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.service.GymReserveService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/reserve")
@AllArgsConstructor
@Api(tags = "订单控制器")
public class GymReserveController {
    private final GymReserveService gymReserveService;

    @GetMapping("/getPage")
    public R<PageVO<GymReserveVO>> getPage(@ModelAttribute GymReservePageQueryBO gymReservePageQueryBO) {
        return R.data(gymReserveService.getPage(gymReservePageQueryBO));
    }

    @PostMapping("/update")
    public R<Void> update(@RequestBody GymUserDTO gymUserDTO) {
        gymReserveService.updateByReserveId(gymUserDTO);
        return R.success();
    }

    @PostMapping("/getDetail/{id}")
    public R<List<GymReserveVO>> getDetailById(@PathVariable Integer id) {
        return R.data(gymReserveService.getDetailById(id));
    }
}
