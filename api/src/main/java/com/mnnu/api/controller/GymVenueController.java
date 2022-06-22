package com.mnnu.api.controller;

import com.mnnu.api.entity.vo.GymVenueVO;
import com.mnnu.api.service.GymVenueService;
import com.mnnu.common.common.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/venue")
@AllArgsConstructor
@Api(tags = "场馆里的会场")
public class GymVenueController {
    private final GymVenueService gymVenueService;
    @ApiOperation("通过体育场id获得会场信息")
    @GetMapping("/{id}")
    public R<List<GymVenueVO>> getByStadiumId(@PathVariable int id) {
        return R.data(gymVenueService.getVenueById(id));
    }
}
