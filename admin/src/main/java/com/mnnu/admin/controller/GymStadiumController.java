package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymStadiumPageQueryBO;
import com.mnnu.admin.entity.dto.GymStadiumDTO;
import com.mnnu.admin.entity.vo.GymStadiumVO;
import com.mnnu.admin.service.GymStadiumService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    public R<Void> update(@RequestBody GymStadiumDTO gymStadiumDTO) {
        gymStadiumService.updateByStadiumId(gymStadiumDTO);
        return R.success();
    }

    @PostMapping("/delete/{id}")
    public R<Void> delete(@PathVariable Integer id) {
        gymStadiumService.removeById(id);
        return R.success();
    }

}
