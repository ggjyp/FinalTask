package com.jyp.onlineexam.action;

import com.jyp.onlineexam.model.Student;
import com.jyp.onlineexam.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by shentao on 2016/5/22.
 */
public class StudentAction extends ActionSupport{
    private StudentService studentService;
    private Student student;

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() { return student;}

    public void setStudent(Student student) {this.student = student;}

    public String login() throws Exception {
        String name = student.getName();
        String pwd = student.getPwd();
        System.out.println("name=" + name);
        System.out.println("pwd=" + pwd);
        System.out.println("登陆验证……");
        Student student = getStudentService().login(name,pwd);
        System.out.println("验证完成……");
        System.out.println(student.toString());
        if (student!=null) {
            return SUCCESS;
        }
        return ERROR;
    }


    public  String register() throws Exception{
        String name = this.getStudent().getName();
        String pwd = this.getStudent().getPwd();
        System.out.println("username=" + name);
        System.out.println("pwd=" + pwd);

        Student student = new Student();
        student.setName(name);
        student.setPwd(pwd);

        int i = getStudentService().register(student);
        if(i==1){
            return SUCCESS;
        }

       return ERROR;

    }



}
