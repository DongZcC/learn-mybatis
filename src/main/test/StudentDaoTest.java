import com.dzc.dao.StudentDao;
import com.dzc.entity.Course;
import com.dzc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class StudentDaoTest {

    @Test
    public void testFind() {
        SqlSessionFactory factory = getSqlSessionFactory();
        SqlSession session = factory.openSession();
        StudentDao studentDao=session.getMapper(StudentDao.class);
        Student stu = studentDao.findStudentById(20140101);
        for (Course c:
             stu.getCourseList()) {
            System.out.println(c.getName());
        }
    }


    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory factory = null;
        String resource = "configuration.xml";
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return factory;
    }

}
