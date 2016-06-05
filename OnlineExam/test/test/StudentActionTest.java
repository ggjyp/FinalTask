package test;

import com.jyp.onlineexam.dao.StudentDao;
import com.jyp.onlineexam.model.Student;
import com.jyp.onlineexam.service.StudentService;
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
 * Created by Administrator on 2016/6/5.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional

public class StudentActionTest  {
    @Resource
    Student student;
    StudentService studentService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: login()
     *
     */
    @Test
    public void testLogin() throws Exception {


    }

    /**
     *
     * Method: register()
     *
     */
    @Test
    public void testRegister() throws Exception {
//TODO: Test goes here...
    }

}
