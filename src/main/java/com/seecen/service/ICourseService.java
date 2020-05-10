package com.seecen.service;

import com.github.pagehelper.PageInfo;
import com.seecen.model.Course;
import com.seecen.model.Teacher;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    void save(Course course);

    PageInfo<Course> findCourseByParam(Course course, int pageNum, int pageSize);

    void delete(int cid);

    void update(Course course);

    Course getById(Integer tid);
}
