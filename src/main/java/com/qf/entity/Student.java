package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lds
 * @date 2019/11/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("student2")  //自动找数据库中的表，实体类名得和表名相同
public class Student implements Serializable {

    @TableId(type = IdType.AUTO)  //设置主键
    private Integer id;
    @TableField("name") //当实体类属性与表的字段不相同时可添加注解
    private String name;
    private Integer age;
    private Date birthday;
}
