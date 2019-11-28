package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;

/**
 * @author lds
 * @date 2019/11/27
 */
public interface StuMapper extends BaseMapper<Student> {

    int addStu(Student student);
}
