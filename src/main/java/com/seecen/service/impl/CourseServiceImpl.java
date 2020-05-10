package com.seecen.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.dao.ICourseDao;
import com.seecen.model.Course;
import com.seecen.model.Teacher;
import com.seecen.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
   @Autowired
    private ICourseDao iCourseDao;

    @Override
    public List<Course> findAll() {
        return iCourseDao.selectAll();
    }

    @Transactional//添加声明式事务，遇到错误回滚
    public void save(Course course) {
        int res=iCourseDao.insert(course);
        System.out.println("受影响的行数"+res);
    }

    @Override
    public PageInfo<Course> findCourseByParam(Course course, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<Course>courses = iCourseDao.selectByParam(course);
        PageInfo<Course> pageInfo=new PageInfo<>(courses);
        return pageInfo;
    }

    @Transactional//添加声明式事务，遇到错误回滚
    public void delete(int cid) {
        int res=iCourseDao.deleteByPrimaryKey(cid);
        System.out.println("受影响的行数"+res);
    }

    @Transactional
    public void update(Course course) {
        iCourseDao.updateByPrimaryKey(course);
    }

    @Transactional(readOnly = true)
    public Course getById(Integer cid) {
        return iCourseDao.selectByPrimaryKey(cid);
    }


}
