package com.mnnu.admin.controller;

import com.mnnu.admin.entity.bo.GymCommentPageQueryBO;
import com.mnnu.admin.entity.vo.GymCommentVO;
import com.mnnu.admin.entity.vo.GymReserveVO;
import com.mnnu.admin.service.GymCommentService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/comment")
@AllArgsConstructor
@Api(tags = "评论")
public class GymCommentController {
    GymCommentService gymCommentService;
    @GetMapping("/getPage")
    public R<PageVO<GymCommentVO>> getPage(@ModelAttribute GymCommentPageQueryBO bo)
    {
        return R.data(gymCommentService.getPage(bo));
    }
    @PostMapping("/getDetail/{id}")
    public R<List<GymCommentVO>> getDetailById(@PathVariable Integer id) {
        return R.data(gymCommentService.getDetailById(id));
    }
}
