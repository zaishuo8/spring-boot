package com.xuting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by xuting on 2017/7/30.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /*
    * 插入两个女生 需要是事务，两个都插进，或者都不插进
    * */
    @Transactional   // 事务注解
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("D");
        girlA.setAge(26);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("E");
        girlB.setAge(18);
        girlRepository.save(girlB);
    }
}
