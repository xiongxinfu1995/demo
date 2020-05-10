package com.seecen.service;

import com.github.pagehelper.PageInfo;
import com.seecen.model.Teacher;

import java.util.List;

public interface ITeacherService {

List<Teacher> findTeacherByCid(Integer cid);

    List<Teacher> selectAll();


    void save(Teacher teacher);

    PageInfo<Teacher> findTeacherByParam(Teacher teacher,int pageNum,int pageSize);

    void delete(int tid);

    void update(Teacher teacher);

    Teacher getById(Integer tid);
}
