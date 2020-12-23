package com.qf.provider.service.Impl;

import com.qf.provider.common.vo.R;
import com.qf.provider.dao.FoodDao;
import com.qf.provider.entity.Food;
import com.qf.provider.service.Intf.FoodService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 20:37:00
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;
    @Override
    public R save(String name, int p) {
       if (foodDao.insert(new Food(name,p))>0){
            return R.Ok();
        } else {
           return R.fail();
       }
    }

    @Override
    public R all() {
        return R.Ok(foodDao.selectList(null));
    }

    @Override
    public R saveBath(int count) {
        for (int i=1;i<=count;i++){
            foodDao.insert(new Food("胡辣汤-"+i,i%6));
        }

        return R.Ok();
    }


}
