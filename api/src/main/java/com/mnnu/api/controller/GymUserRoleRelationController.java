package com.mnnu.api.controller;

import com.mnnu.api.service.GymUserRoleRelationService;
import com.mnnu.api.service.GymUserService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymUserDO;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;
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
@RequestMapping("/userRoleRelation")
@AllArgsConstructor
@Api(tags = "用户_角色_关系控制器")
public class GymUserRoleRelationController {
    private final GymUserRoleRelationService gymUserRoleRelationService;

    @PostMapping("/update")
    public R<Void> update(@RequestBody GymUserRoleRelationDO gymUserRoleRelationDO) {
        gymUserRoleRelationService.updateById(gymUserRoleRelationDO);
        return R.success();
    }
}
