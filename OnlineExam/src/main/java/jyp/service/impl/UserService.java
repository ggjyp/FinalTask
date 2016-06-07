package jyp.service.impl;

import jyp.dao.UserDaoI;
import org.springframework.stereotype.Service;


import jyp.model.TbUser;
import jyp.service.UserServiceI;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/6/7.
 */
@Service("userService")
public class UserService implements UserServiceI{

    @Resource(name = "userDao")
    private UserDaoI userDao;

    @Override
    public void test() {
        System.out.println("userService");
    }

    @Override
    public TbUser  save(TbUser user) throws Exception {
        userDao.save(user);
        return user;
    }

    @Override
    public TbUser login(TbUser user) throws Exception {
        String username = user.getUsername();
        String password = user.getPassword();
        if(userDao.get(username, password) != null)
            return userDao.get(username, password);
        else
            return null;
    }

    @Override
    public TbUser register(TbUser user) {
        TbUser temp = userDao.get(user.getUsername(),user.getPassword());
        if(temp == null) {
            userDao.save(user);
            return user;
        }
        else
            return null;
    }


}
