package cn.sen.middleware.mybatis.test;

import cn.sen.middleware.mybatis.Resources;
import cn.sen.middleware.mybatis.SqlSession;
import cn.sen.middleware.mybatis.SqlSessionFactory;
import cn.sen.middleware.mybatis.SqlSessionFactoryBuilder;
import cn.sen.middleware.mybatis.test.po.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * @Author caosen
 * @Date 2023/4/10 11:36
 */
public class ApiTest {

    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("cn.sen.middleware.mybatis.test.dao.IUserDao.queryUserInfoById", 1L);
                System.out.println(JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test_queryUserList() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User req = new User();
                req.setUserNickName("");
                List<User> userList = session.selectList("cn.sen.middleware.mybatis.test.dao.IUserDao.queryUserList", req);
                System.out.println(JSON.toJSONString(userList));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
