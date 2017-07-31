package com.xuting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xuting on 2017/7/30.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /*
    * 获取女生列表
    * */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();     // findAll: select * from dbgirl
    }

    /*
    * 添加一个女生
    * */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){

        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);    // save方法: 将 girl 插进数据库，并返回插进的 Girl 对象
    }

    /*
    * 查询一个女生
    * */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable Integer id){
        return girlRepository.findOne(id);
    }

    public void girlTwo(){
        girlService.insertTwo();
    }
}
