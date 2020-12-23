package com.qf.consumer.controller;

import com.qf.consumer.service.HelloService;
import com.qf.provider.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 20:02:00
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/api/hi.do")
    public R hi() {
        return helloService.hello();
    }
    @PostMapping("/api/save.do")
    public R save(@RequestParam String n, @RequestParam int p) {
        return helloService.save(n,p);
    }
    @GetMapping("/api/all.do")
    public R all() {
        return helloService.all();
    }
    @GetMapping("/api/saveAll.do")
    public R saveAll(@RequestParam int c) {
        return helloService.saveAll(c);
    }
}
