package cn.ims.ims.demo.service;

import cn.ims.ims.demo.dao.UserDao;
import cn.ims.ims.demo.entity.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo login(String username) {

        return userDao.login(username);

    }

    @Override
    public int register(UserInfo user) {

        return userDao.register(user);

    }
    @Override
    public List<UserInfo> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public UserInfo findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public int addUser(UserInfo userInfo) {
        return userDao.addUser(userInfo);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }

}
