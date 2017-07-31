package com.xuting;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xuting on 2017/7/30.
 */
/*
* 该接口继承 JpaRepository ,相当于 dao 层内容，操作数据库
* <Girl, Integer>  Girl: 数据表对应的类，Integer: id 对应的类型
* */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 扩展数据库操作的接口 (方法名的写法是有规则的 find + By + 字段 + 条件 + 排序规则 等等)
    public List<Girl> findByAge(Integer age);
}
