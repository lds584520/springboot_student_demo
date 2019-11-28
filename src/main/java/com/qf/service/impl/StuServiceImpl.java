package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lds
 * @date 2019/11/27
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    public int addStu(Student student) {
        return stuMapper.addStu(student);
    }
}
