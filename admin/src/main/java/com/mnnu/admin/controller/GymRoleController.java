package com.mnnu.admin.controller;

import com.mnnu.admin.service.GymRoleService;
import com.mnnu.common.common.R;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/role")
@AllArgsConstructor
@Api(tags = "角色控制器")
public class GymRoleController {
    private final GymRoleService gymRoleService;

}
