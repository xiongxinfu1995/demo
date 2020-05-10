package com.seecen.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.dao.ITeacherDao;
import com.seecen.model.Teacher;
import com.seecen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {


    @Autowired//去ioc容器中，找IteacherDao类型的对象
    private ITeacherDao teacherDao;

    @Override
    public List<Teacher> selectAll() {
        return teacherDao.selectAll();
    }

    @Transactional//添加声明式事务，遇到错误回滚
    public void save(Teacher teacher) {
        int res=teacherDao.insert(teacher);
        System.out.println("受影响的行数"+res);

    }


    @Override
    public PageInfo<Teacher> findTeacherByParam(Teacher teacher,int pageSize,int pageNum) {
        PageHelper.startPage(pageNum,pageSize);

        List<Teacher>teachers = teacherDao.selectByParam(teacher);
        PageInfo<Teacher> pageInfo=new PageInfo<>(teachers);
        return pageInfo;
    }

    @Transactional//添加声明式事务，遇到错误回滚
    public void delete(int tid) {
        int res=teacherDao.deleteByPrimaryKey(tid);
        System.out.println("受影响的行数"+res);
    }

    @Transactional
    public void update(Teacher teacher) {
        teacherDao.updateByPrimaryKey(teacher);
    }

    @Transactional(readOnly = true)
    public Teacher getById(Integer tid) {
        return teacherDao.selectByPrimaryKey(tid);
    }

    @Override
    public List<Teacher> findTeacherByCid(Integer cid) {


        return teacherDao.findTeacherByCid1(cid);
    }
}
