package test.com.jyp.onlineexam.service; 

import com.jyp.onlineexam.dao.StudentDao;
import com.jyp.onlineexam.model.Student;
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
* StudentServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 5, 2016</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class StudentServiceImplTest {
    @Resource
    StudentDao studentDao;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getStudentDao() 
* 
*/ 
@Test
public void testGetStudentDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setStudentDao(StudentDao userDao) 
* 
*/ 
@Test
public void testSetStudentDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateByQuery(String hql) 
* 
*/ 
@Test
public void testUpdateByQuery() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findById(Integer id) 
* 
*/ 
@Test
public void testFindById() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findByqQuery(String hql) 
* 
*/ 
@Test
public void testFindByqQuery() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findAll() 
* 
*/ 
@Test
public void testFindAll() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: queryForPage(String hql, int offset, int length) 
* 
*/ 
@Test
public void testQueryForPage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: register(Student student) 
* 
*/ 
@Test
public void testRegister() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(Student student) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(Student student) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: login(String name, String pwd) 
* 
*/ 
@Test
public void testLogin() throws Exception { 
//TODO: Test goes here...
    String name = "jyp";
    String pwd = "123456";
    Student student = studentDao.login(name,pwd);
    System.out.println(student);


} 


} 
