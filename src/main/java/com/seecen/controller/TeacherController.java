package com.seecen.controller;


import com.github.pagehelper.PageInfo;
import com.seecen.model.Teacher;
import com.seecen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//restController相当于，requestbody，controller

@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/course/{cid}.do")
    public List<Teacher> teachers(@PathVariable("cid") Integer cid) {
//PathVariable注解是把地址栏后面的数据，赋值给方法的参数
        List<Teacher> teachers = teacherService.findTeacherByCid(cid);

        return teachers;
    }

    @RequestMapping("/teacher/course2/user.do")
    public List<Teacher> teachers2() {

        List<Teacher> teachers = teacherService.selectAll();

        return teachers;
    }

    @RequestMapping("/page/{pageSize}/{pageNum}.do")
    public PageInfo<Teacher> teachers(@RequestBody(required = false)
            Teacher teacher, @PathVariable(required = false)
            int pageNum, @PathVariable(required = false) int pageSize) {
//PathVariable注解是把地址栏后面的数据，赋值给方法的参数
        PageInfo<Teacher> teachers = teacherService.findTeacherByParam(teacher, pageNum, pageSize);

        return teachers;
    }

    /*添加*/
    @PostMapping("/save.do")
    public Boolean save(@RequestBody Teacher teacher) {
        System.out.println("----------------" + teacher + "-----------------------");
        teacherService.save(teacher);
        return true;
    }
/*删除*/
@PostMapping("/delete/{tid}.do")
public Boolean delete( @PathVariable(required = false) int tid) {
    System.out.println("----------------" + tid + "-----------------------");
    teacherService.delete(tid);
    return true;
}

    /*修改*/
    @PostMapping("/update.do")
    public boolean update(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return true;
    }

    @RequestMapping("/{tid}.do")
    public Teacher teacher(@PathVariable("tid") Integer tid) {
        return teacherService.getById(tid);
    }

}





