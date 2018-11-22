package cn.ims.ims.demo.dao;

import cn.ims.ims.demo.entity.po.UserInfo;

import java.util.List;

/**
 * 用户Dao
 */
public interface UserDao {

    /**
     * 登录功能
     *
     * @param username
     * @return
     */
    public UserInfo login(String username);

    /**
     * 注册功能
     *
     * @param user
     * @return
     */
    public int register(UserInfo user);

    public List<UserInfo> findAllUser();

    public UserInfo findUserById(Integer id);

    public int addUser(UserInfo userInfo);

    public int deleteUserById(Integer id);

    public int updateUser(UserInfo userInfo);
}