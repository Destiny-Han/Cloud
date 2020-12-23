package com.qf.provider.service.Intf;

import com.qf.provider.common.vo.R;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 20:36:00
 */
public interface FoodService {
    R save(String name, int p);
    R all();
    R saveBath(int count);
}
