import com.dzc.dao.UserDao;
import com.dzc.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247<br>
 * 开发时间: 2018-01-05<br>
 */
public class UserDaoTest {

//    @Test
//    public void findUserById() {
//        SqlSession sqlSession = getSessionFactory().openSession();
//        UserDao userMapper = sqlSession.getMapper(UserDao.class);
//        User user = userMapper.findUserById(1);
//        Assert.assertNull("没找到数据", user);
//    }
//
//    @Test
//    public void insert() {
//        SqlSession sqlSession = getSessionFactory().openSession();
//        UserDao userMapper = sqlSession.getMapper(UserDao.class);
//        User user = new User();
//        user.setId(3);
//        user.setName("dzc");
//        user.setAge(22);
//        user.setDeleteFlag(0);
//        user.setPassword("123456");
//        userMapper.insert(user);
//        sqlSession.commit();
//    }


    @Test
    public void findUserById() {
        SqlSession session = getSessionFactory().openSession();
        try {
            /*UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectUserById(1);
            System.out.println(user);*/
            Object o = session.selectOne("com.dzc.dao.UserDao.findUserById", 1);
            System.out.println("我是第一次查询的" + o);
            System.out.println("-------------------------------我是分割线---------------------");
            Object z = session.selectOne("com.dzc.dao.UserDao.findUserById", 1);
            System.out.println("我是第二次查询的" + z);
           /*User user = new User();
           user.setAge(15);
           user.setName("achuan");
           int insert = session.insert("com.wsdsg.spring.boot.analyze.mapper.UserMapper.addOneUser", user);
           session.commit();
           System.out.println(insert);*/
        } finally {
            session.close();
        }
    }

    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                    .getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

}