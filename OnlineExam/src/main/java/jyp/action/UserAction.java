package jyp.action;

import com.opensymphony.xwork2.ActionSupport;
import jyp.model.TbUser;
import jyp.service.UserServiceI;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2016/6/7.
 */
@ParentPackage("basePackage")
@Results( { @Result(location = "/showuser.jsp"),
        @Result(name = "error", location = "/login.jsp") })
@Namespace("/")
@Action(value = "userAction")
public class UserAction extends ActionSupport{

    private TbUser user = new TbUser();

    public TbUser getUser() {
        return user;
    }

    public void setUser(TbUser user) {
        this.user = user;
    }

    @Resource(name="userService")
    private UserServiceI userService;

    public String login() throws Exception {
        TbUser u = userService.login(getUser());
        if(u != null)
            return SUCCESS;
        else
            return ERROR;
    }

    public String register(){
        TbUser u = userService.register(getUser());
        if(u != null){
            System.out.print("register success");
            return SUCCESS;
        }

        else{
            System.out.print("register fail");
            return ERROR;
        }

    }


}
