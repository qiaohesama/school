package com.mnnu.admin.controller;

import com.mnnu.admin.entity.vo.GymStadiumInfoVO;
import com.mnnu.admin.service.GymStadiumInfoService;
import com.mnnu.common.common.R;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/stadiumInfo")
@AllArgsConstructor
@Api(tags = "体育馆详情控制器")
public class GymStadiumInfoController {
    private final GymStadiumInfoService gymStadiumInfoService;
    @GetMapping("/{id}")
    public R<GymStadiumInfoVO> getPage(@PathVariable Integer id) {
        return R.data(gymStadiumInfoService.getStadiumInfoById(id));
    }
    @PostMapping("getDetail/{id}")
    public R<List<GymStadiumInfoVO>> getDetail(@PathVariable Integer id)
    {
        return  R.data(gymStadiumInfoService.getStadiumInfoDetail(id));
    }
}
