package com.qf.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 20:33:00
 */
@Data
@TableName("t_food")
@NoArgsConstructor
public class Food {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer price;

    public Food(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
