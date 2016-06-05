package com.jyp.onlineexam.dao;

import com.jyp.onlineexam.common.CommonDaoImpl;
import com.jyp.onlineexam.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by shentao on 2016/5/21.
 */
public class StudentDaoImpl extends CommonDaoImpl<Student> implements StudentDao {

    @Override
    public Student login(String name, String pwd) {
        try {
            String hql ="from Student where name=? and pwd=?";
            Session session = getSessionFactory().getCurrentSession();
            Query query = session.createQuery(hql);
            query.setString(0,name);
            query.setString(1,pwd);
            return (Student) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
