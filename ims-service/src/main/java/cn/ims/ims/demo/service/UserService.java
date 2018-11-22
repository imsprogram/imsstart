package cn.ims.ims.demo.service;

import cn.ims.ims.demo.entity.po.UserInfo;

import java.util.List;

public interface UserService {

    /**
     * 登录功能
     *
     * @param username
     * @return 用户信息
     */
    public UserInfo login(String username);

    /**
     * 注册功能
     *
     * @param user
     * @return 执行结果
     */
    public int register(UserInfo user);

    /**
     * 查找所有用户
     * @return
     */
    public List<UserInfo> findAllUser();

    /**
     * 通过用户id查询用户
     * @param id
     * @return
     */
    public UserInfo findUserById(Integer id);

    /**
     * 添加用户
     */
    public int addUser(UserInfo userVo);

    /**
     * 通过用户id删除用户
     */
    public int deleteUserById(Integer id);

    /**
     * 通过用户id更新用户信息
     */
    public int updateUser(UserInfo userInfo);
}
