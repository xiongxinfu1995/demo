package com.seecen.controller;

import com.github.pagehelper.PageInfo;
import com.seecen.model.Course;
import com.seecen.model.Teacher;
import com.seecen.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService iCourseService;

    @GetMapping("/all.do")
    public List<Course> findAll(){
        return iCourseService.findAll();
    }


    /*添加*/
    @PostMapping("/save.do")
    public Boolean save(@RequestBody Course course) {
        System.out.println("----------------" + course + "-----------------------");
        iCourseService.save(course);
        return true;
    }


    /*删除*/

    @PostMapping("/delete/{cid}.do")
    public Boolean delete( @PathVariable(required = false) int cid) {
        System.out.println("----------------" + cid + "-----------------------");
        iCourseService.delete(cid);
        return true;
    }
    /*分页查询*/
    @RequestMapping("/page/{pageSize}/{pageNum}.do")
    public PageInfo<Course> teachers(@RequestBody(required = false)
                 Course course, @PathVariable(required = false)
                 int pageNum, @PathVariable(required = false) int pageSize) {
//PathVariable注解是把地址栏后面的数据，赋值给方法的参数
        PageInfo<Course> courses =
                iCourseService.findCourseByParam(course, pageNum, pageSize);

        return courses;
    }

    /*修改*/
    @PostMapping("/update.do")
    public boolean update(@RequestBody Course course) {
        iCourseService.update(course);
        return true;
    }

    @RequestMapping("/{cid}.do")
    public Course course(@PathVariable("cid") Integer cid) {
        return iCourseService.getById(cid);
    }
}
