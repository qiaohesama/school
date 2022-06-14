package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.api.entity.vo.GymStadiumVO;
import com.mnnu.api.service.GymStadiumService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/stadium")
@AllArgsConstructor
@Api(tags = "体育馆控制器")
public class GymStadiumController {
    private final GymStadiumService gymStadiumService;

    @GetMapping("/getPage")
    public R<PageVO<GymStadiumVO>> getPage(@ModelAttribute GymStadiumPageQueryBO bo) {
        return R.data(gymStadiumService.getPage(bo));
    }

}
