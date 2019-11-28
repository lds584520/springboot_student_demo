package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lds
 * @date 2019/11/27
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String stuList(Model model){
        List<Student> list = stuService.list();
        model.addAttribute("list",list);
        return "stulist";
    }

    @RequestMapping("/delete")
    public  String delete(Integer id){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }

    @RequestMapping("toadd")
    public String toAdd(){
        return "stuadd";
    }


    @RequestMapping("add")
    public String stuadd(Student student){
        int result=stuService.addStu(student);
        if (result>0){
            System.out.println(student.getId());
            return "redirect:/stu/list";
        }
        return "stuadd";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Integer id,Model model){
        Student stu = stuService.getById(id);
        model.addAttribute("stu",stu);
        return "stuUpdate";
    }

    @RequestMapping("update")
    public String update(Student student){
        System.out.println(student);
        boolean update = stuService.updateById(student);
        if (update){
            return "redirect:/stu/list";
        }
        return "redirect:/stu/list";
    }

}
