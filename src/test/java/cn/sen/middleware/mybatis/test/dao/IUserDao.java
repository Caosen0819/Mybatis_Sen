package cn.sen.middleware.mybatis.test.dao;

import cn.sen.middleware.mybatis.test.po.User;

/**
 * @Author caosen
 * @Date 2023/4/10 11:37
 */
public interface IUserDao {
    User queryUserInfoById(Long id);
}
