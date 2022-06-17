package com.mnnu.admin.controller;

import com.mnnu.admin.entity.vo.GymVenueVO;
import com.mnnu.admin.service.GymVenueService;
import com.mnnu.common.common.R;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/venue")
@AllArgsConstructor
@Api(tags = "会场控制器")
public class GymVenueController {
    private final GymVenueService gymVenueService;
    @PostMapping("{id}")
    public R<List<GymVenueVO>> getVenueByStadiumId(@PathVariable int id) {
        return R.data(gymVenueService.getVenueByStadiumId(id));
    }

}
