package com.mnnu.api.controller;

import com.mnnu.api.entity.bo.GymCommentPageQueryBO;
import com.mnnu.api.entity.bo.GymPaymentLogPageQueryBO;
import com.mnnu.api.entity.vo.GymCommentVO;
import com.mnnu.api.entity.vo.GymPaymentLogVO;
import com.mnnu.api.service.GymCommentService;
import com.mnnu.common.common.R;
import com.mnnu.common.entity.vo.PageVO;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/gymComment")
@AllArgsConstructor
@Api(tags = "评论控制器")
public class GymCommentController {
    GymCommentService gymCommentService;
    @GetMapping("/getPage")
    public R<PageVO<GymCommentVO>> getPage(@ModelAttribute GymCommentPageQueryBO bo)
    {
        System.out.println(bo);
        return R.data(gymCommentService.getPage(bo));
    }
}
