package test;

import com.jyp.onlineexam.dao.StudentDao;
import com.jyp.onlineexam.model.Student;
import com.jyp.onlineexam.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/** 
* StudentServiceTest Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional

public class StudentServiceTest {

    @Resource
    StudentDao studentDao;
    StudentService studentService;

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception { 
}

    @Test
    public void testLogin() throws Exception {
        Student result = null;
        result.setId(1);
        result.setName("jyp");
        result.setPwd("123456");
        Student student = studentService.login("jyp","123456");
        Assert.assertEquals(result, student);
    }

} 
