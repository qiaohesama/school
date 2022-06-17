package com.mnnu.admin.controller;

import com.mnnu.admin.entity.dto.GymUserRoleRelationDTO;
import com.mnnu.admin.service.GymUserRoleRelationService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymStadiumDO;
import com.mnnu.common.entity.domain.GymUserRoleRelationDO;
import io.swagger.annotations.Api;
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
    public R<Void> update(@RequestBody GymUserRoleRelationDTO gymUserRoleRelationDTO) {
        gymUserRoleRelationService.updateByUserRoleRelationId(gymUserRoleRelationDTO);
        return R.success();
    }
    @PostMapping("/save")
    public R<Void> save(@RequestBody GymUserRoleRelationDTO gymUserRoleRelationDTO) {
        gymUserRoleRelationService.saveUserRoleRelation(gymUserRoleRelationDTO);
        return R.success();
    }
}
