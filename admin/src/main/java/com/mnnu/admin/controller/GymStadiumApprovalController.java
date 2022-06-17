package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymStadiumApprovalPageQueryBO;
import com.mnnu.admin.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.admin.entity.vo.GymStadiumApprovalVO;
import com.mnnu.admin.entity.vo.GymStadiumVO;
import com.mnnu.admin.service.GymStadiumApprovalService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/stadiumApproval")
@AllArgsConstructor
@Api(tags = "体育馆控制器")
public class GymStadiumApprovalController {
    GymStadiumApprovalService gymStadiumApprovalService;
    @GetMapping("/getPage")
    public R<PageVO<GymStadiumApprovalVO>> getPage(@ModelAttribute GymStadiumApprovalPageQueryBO bo) {
        return R.data(gymStadiumApprovalService.getPage(bo));
    }
    @PostMapping("/update")
    public R<Void> update(@RequestBody GymStadiumApprovalDTO gymStadiumApprovalDTO) {
        gymStadiumApprovalService.updateStadiumApprovalById(gymStadiumApprovalDTO);
        return R.success();
    }
}
