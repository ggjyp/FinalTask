package com.jyp.onlineexam.service;

import com.jyp.onlineexam.model.Student;

import java.util.List;


/**
 * Created by jyp on 2016/6/1.
 */

public interface StudentService {

    public int register(Student student) throws Exception;
    public void delete(Student student) throws Exception;
    public void update(Student student) throws Exception;
    public Student login(String username, String password) throws Exception;
    public int updateByQuery(String hql);
    public Student findById(Integer id);
    public List<Student> findByqQuery(String hql);
    public List<Student> findAll();
    public  List<Student> queryForPage(String hql, int offset, int length);


}
