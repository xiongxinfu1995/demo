package com.seecen.dao;

import com.seecen.model.Teacher;
import java.util.List;

public interface ITeacherDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher teacher);

    Teacher selectByPrimaryKey(Integer tid);

    List<Teacher> selectAll();

    List<Teacher> selectByParam(Teacher teacher);

    int updateByPrimaryKey(Teacher record);

    List<Teacher> findTeacherByCid1(Integer cid);
}