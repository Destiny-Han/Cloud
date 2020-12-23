package com.qf.provider.controller;

import com.qf.provider.common.vo.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 17:05:00
 */
@RestController
public class HelloController {
    @GetMapping("/provider/hi.do")
    public R hi() {
        return R.Ok("你好，八班！");
    }
}
