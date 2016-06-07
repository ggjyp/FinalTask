package jyp.dao;

import jyp.model.TbUser;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/7.
 */
public interface UserDaoI {
    public Serializable save(TbUser o);

    public void delete(TbUser o);

    public void update(TbUser o);

    public void saveOrUpdate(TbUser o);

    public TbUser get(String username, String password);

    public TbUser get(Class<TbUser> c, Serializable id);

    public TbUser get(String hql);

    public TbUser get(String hql, Map<String, Object> params);

    public List<TbUser> find(String hql);

    public List<TbUser> find(String hql, Map<String, Object> params);

    public List<TbUser> find(String hql, int page, int rows);

    public List<TbUser> find(String hql, Map<String, Object> params, int page, int rows);

    public Long count(String hql);

    public Long count(String hql, Map<String, Object> params);

    public int executeHql(String hql);

}
