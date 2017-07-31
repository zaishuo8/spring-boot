package com.xuting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuting on 2017/7/30.
 */

@Entity      // 该注解表示对应数据库里边的表
public class Girl {
            ////123123123
    @Id                   // 主键
    @GeneratedValue       // 自增加
    private Integer id;

    private String cupSize;

    private Integer age;

    /*-需要一个无参数的构造方法-*/
    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
