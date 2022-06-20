package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymUserPageQueryBO;
import com.mnnu.admin.entity.dto.GymUserDTO;
import com.mnnu.admin.entity.vo.GymUserVO;
import com.mnnu.admin.service.GymUserService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
@AllArgsConstructor
@Api(tags = "用户控制器")
public class GymUserController {
    private final GymUserService gymUserService;

    @GetMapping("/getPage")
    public R<PageVO<GymUserVO>> getPage(@ModelAttribute GymUserPageQueryBO bo) {
        return R.data(gymUserService.getPage(bo));
    }

    @PostMapping("/update")
    public R<Void> update(@RequestBody GymUserDTO gymUserDTO) {
        gymUserService.updateUserById(gymUserDTO);
        return R.success();
    }

    @PostMapping("/delete/{id}")
    public R<Void> delete(@PathVariable Integer id) {
        gymUserService.removeById(id);
        return R.success();
    }
}
