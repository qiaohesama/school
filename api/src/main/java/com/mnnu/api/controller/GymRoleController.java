package com.mnnu.api.controller;

import com.mnnu.api.service.GymReserveService;
import com.mnnu.api.service.GymRoleService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.domain.GymReserveDO;
import com.mnnu.common.entity.domain.GymRoleDO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/role")
@AllArgsConstructor
@Api(tags = "角色")
public class GymRoleController {
    private final GymRoleService gymRoleService;

}
