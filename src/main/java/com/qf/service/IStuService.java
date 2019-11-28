package com.qf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @author lds
 * @date 2019/11/27
 */
@Service
public interface IStuService extends IService<Student> {
    int addStu(Student student);
}
