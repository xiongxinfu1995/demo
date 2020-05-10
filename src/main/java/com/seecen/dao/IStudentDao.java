package com.seecen.dao;

import com.seecen.model.Student;
import java.util.List;

public interface IStudentDao {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    Student selectByPrimaryKey(Integer sid);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}