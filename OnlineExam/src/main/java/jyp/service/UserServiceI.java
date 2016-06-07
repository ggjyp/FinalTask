package jyp.service;

import jyp.model.TbUser;

/**
 * Created by Administrator on 2016/6/7.
 */
public interface UserServiceI {
    public void test();

    public TbUser save(TbUser user) throws Exception;

    public TbUser login(TbUser user) throws Exception;

    public TbUser register(TbUser user);
}
