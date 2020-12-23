package com.qf.provider.controller;

import com.qf.provider.common.vo.R;
import com.qf.provider.service.Intf.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 20:41:00
 */
@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;
    @PostMapping("/provider/save.do")
    public R save(@RequestParam String n,@RequestParam int p) {
       return foodService.save(n,p);
    }
    @GetMapping("/provider/all.do")
    public R all() {
        return foodService.all();
    }
    @GetMapping("/provider/saveAll.do")
    public R saveAll(@RequestParam int c) {
        return foodService.saveBath(c);
    }
}
