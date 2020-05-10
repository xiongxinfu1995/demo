package com.seecen.dao;

import com.seecen.model.Course;
import com.seecen.model.Teacher;

import java.util.List;

public interface ICourseDao {
    int deleteByPrimaryKey(Integer cid);

    int insert(Course record);

    Course selectByPrimaryKey(Integer cid);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);

    List<Course> selectByParam(Course course);

}