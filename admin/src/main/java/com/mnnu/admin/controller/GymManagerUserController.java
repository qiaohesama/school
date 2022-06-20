package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymManagerUserBO;
import com.mnnu.admin.entity.bo.GymReservePageQueryBO;
import com.mnnu.admin.entity.dto.GymManagerUserDTO;
import com.mnnu.admin.entity.vo.GymManagerUserVO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.service.GymManagerUserService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/managerUser")
@AllArgsConstructor
public class GymManagerUserController {
    GymManagerUserService gymManagerUserService;

    @GetMapping("/getPage")
    public R<PageVO<GymManagerUserVO>> getPage(@ModelAttribute GymManagerUserBO gymManagerUserBO) {

        return R.data(gymManagerUserService.getPage(gymManagerUserBO));
    }

    @PostMapping("/delete/{id}")
    public R<Void> delete(@PathVariable Integer id) {
        gymManagerUserService.removeById(id);
        return R.success();
    }

    @PostMapping("/update")
    public R<Void> update(@RequestBody GymManagerUserDTO gymManagerUserDTO) {
        gymManagerUserService.updateGymManagerUseById(gymManagerUserDTO);
        return R.success();
    }

    @PostMapping("/save")
    public R<Void> save(@RequestBody GymManagerUserDTO gymManagerUserDTO) {
        gymManagerUserService.saveManagerUser(gymManagerUserDTO);
        return R.success();
    }
    @PostMapping("/login")
    public R<Boolean> login(@RequestBody GymManagerUserDTO gymManagerUserDTO){
        return R.data(gymManagerUserService.login(gymManagerUserDTO));
    }
}
