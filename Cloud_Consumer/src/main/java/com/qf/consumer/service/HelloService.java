package com.qf.consumer.service;

import com.qf.provider.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 19:58:00
 */
@FeignClient(value = "HelloProvider")
public interface HelloService {
    //请求方式和请求路径  必须和服务提供者一致，返回值的类型也要一致，请求参数也要一致
    @GetMapping("/provider/hi.do")
    R hello();
    @PostMapping("/provider/save.do")
     R save(@RequestParam String n, @RequestParam int p);

    @GetMapping("/provider/all.do")
     R all();

    @GetMapping("/provider/saveAll.do")
     R saveAll(@RequestParam int c);

}
