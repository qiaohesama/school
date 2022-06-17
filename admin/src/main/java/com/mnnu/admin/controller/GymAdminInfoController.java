package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymAdminInfoBO;
import com.mnnu.admin.entity.vo.GymAdminInfoVO;
import com.mnnu.admin.service.GymAdminInfoService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/adminInfo")
@AllArgsConstructor
public class GymAdminInfoController {
    GymAdminInfoService gymAdminInfoService;

    @PostMapping("/delete/{id}")
    public R<Void> deleteById(@PathVariable Integer id) {
        gymAdminInfoService.removeById(id);
        return R.success();
    }

    @GetMapping("/getPage")
    public R<PageVO<GymAdminInfoVO>> getPage(@ModelAttribute GymAdminInfoBO gymAdminInfoBO){
        return R.data(gymAdminInfoService.getPage(gymAdminInfoBO));
    }
}
