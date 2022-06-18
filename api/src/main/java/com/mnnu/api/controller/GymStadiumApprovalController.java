package com.mnnu.api.controller;

import com.mnnu.api.entity.dto.GymCommentDTO;
import com.mnnu.api.entity.dto.GymStadiumApprovalDTO;
import com.mnnu.api.service.GymStadiumApprovalService;
import com.mnnu.common.common.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/stadiumApprovalController")
@AllArgsConstructor
@Api(tags = "体育馆申请")
public class GymStadiumApprovalController {
    GymStadiumApprovalService gymStadiumApprovalService;
    @ApiOperation("新增一条申请")
    @PostMapping("/save")
    public R<Void> save(@RequestBody GymStadiumApprovalDTO gymStadiumApprovalDTO) {
        gymStadiumApprovalService.saveStadiumApproval(gymStadiumApprovalDTO);
        return R.success();
    }
}
