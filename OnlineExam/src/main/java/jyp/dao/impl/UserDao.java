package jyp.dao.impl;

import jyp.dao.UserDaoI;
import jyp.model.TbUser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/6/7.
 */
@Repository("userDao")
public class UserDao extends BaseDao<TbUser> implements UserDaoI {
    @Override
    public TbUser get(String username, String password) {
        try {
            String hql ="from TbUser where username=? and password=?";
            Session session = getSessionFactory().getCurrentSession();
            Query query = session.createQuery(hql);
            query.setString(0,username);
            query.setString(1,password);
            return (TbUser) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
