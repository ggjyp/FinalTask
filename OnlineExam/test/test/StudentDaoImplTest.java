package test;

import com.jyp.onlineexam.dao.StudentDao;
import com.jyp.onlineexam.model.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 * Created by Administrator on 2016/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional

public class StudentDaoImplTest {

    @Resource
    private StudentDao studentDao;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testFindById() {
        Student student = studentDao
                .findById(1);
        Assert.assertEquals("jyp", student.getName());
        Assert.assertEquals("123456", student.getPwd());
        Assert.assertEquals(1, student.getId());
    }
    @Test
    public void testLogin() throws Exception {
        Student student = studentDao.login("jyp","123456");

    }
}