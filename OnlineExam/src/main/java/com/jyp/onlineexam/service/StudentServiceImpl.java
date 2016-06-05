package com.jyp.onlineexam.service;


import com.jyp.onlineexam.dao.StudentDao;
import com.jyp.onlineexam.model.Student;

import java.util.List;

/**
 * Created by jyp on 2016/6/1.
 */

public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }
    public void setStudentDao(StudentDao userDao) {
        this.studentDao = userDao;
    }


    @Override
    public int updateByQuery(String hql) {
        return getStudentDao().updateByQuery(hql);
    }

    @Override
    public Student findById(Integer id) {
        return getStudentDao().findById(id);
    }

    @Override
    public List<Student> findByqQuery(String hql) {
        return getStudentDao().findByqQuery(hql);
    }

    @Override
    public List<Student> findAll() {
        return getStudentDao().findAll();
    }

    @Override
    public List<Student> queryForPage(String hql, int offset, int length) {
        return getStudentDao().queryForPage(hql,offset,length);
    }


    @Override
    public int register(Student student) throws Exception {
        String name = student.getName();
        List list = getStudentDao().findByqQuery("from Student where name='"+name+"'");
        if(list == null){
            getStudentDao().save(student);
            return 1;
        }
            return -1;

    }

    @Override
    public void delete(Student student) throws Exception {
        getStudentDao().delete(student);
    }

    @Override
    public void update(Student student) throws Exception {
        getStudentDao().update(student);
    }

    @Override
    public Student login(String name, String pwd) throws Exception {
        return getStudentDao().login(name,pwd);
    }


}
