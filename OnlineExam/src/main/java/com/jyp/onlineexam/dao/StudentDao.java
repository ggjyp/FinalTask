package com.jyp.onlineexam.dao;

import com.jyp.onlineexam.model.Student;

import java.util.List;

/**
 * Created by shentao on 2016/5/21.
 */
public interface StudentDao {
    public void save(Student usertableBean) throws Exception;
    public void delete(Student usertableBean) throws Exception;
    public void update(Student usertableBean) throws Exception;
    public Student login(String username, String password) throws Exception;
    public int updateByQuery(String hql);
    public Student findById(Integer id);
    public List<Student> findByqQuery(String hql);
    public List<Student> findAll();
    public  List<Student> queryForPage(String hql, int offset, int length);











}
