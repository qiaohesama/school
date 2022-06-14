package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymStadiumInfoPageQueryBO;
import com.mnnu.api.entity.vo.GymStadiumVO;
import com.mnnu.api.entity.vo.GymUserVO;
import com.mnnu.api.service.GymStadiumInfoService;
import com.mnnu.api.service.GymUserService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymStadiumInfoDO;
import com.mnnu.common.entity.domain.GymUserDO;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
@AllArgsConstructor
@Api(tags = "用户控制器")
public class GymUserController {
    private final GymUserService gymUserService;
    @PostMapping("/update")
    public R<Void> update(@RequestBody GymUserDO gymUserDO) {
        gymUserService.updateById(gymUserDO);
        return R.success();
    }
    @GetMapping("/{id}")
    public R<GymUserVO> getPage(@PathVariable int id) {
        return R.data(gymUserService.getByUserId(id));
    }
}
