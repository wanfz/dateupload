package comm.controller;

import comm.mapper.UserMapper;
import comm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping(path = "/find")
    public @ResponseBody
    User findUserByUserName(@RequestBody User user) {
        return userMapper.findById(user.getId());
    }

    @PostMapping(path = "/login")
    public @ResponseBody
    String loginUser(@RequestBody User user) {
        user = userMapper.findById(user.getId());
        String status = user.getStatus();
        if ("0".equals(status)) {
            return ("该用户未注册！");
        } else if ("3".equals(status)) {
            return ("该用户未打卡！");
        } else if ("5".equals(status)) {
            return ("欢迎" + user.getRealname() + "登录系统！");
        } else {
            return ("error");
        }
    }

    @PostMapping(path = "/register")
    public @ResponseBody
    String addUser(@RequestBody User user) {
        userMapper.addUser(user);
        return "注册成功！";
    }

    @PostMapping(path = "/moduser")
    public @ResponseBody
    String modUser(@RequestBody User user) {
        userMapper.modUserById(user);
        return "User Changed!";
    }

    @PostMapping(path = "/clouser")
    public @ResponseBody
    String clockUser(@RequestBody User user){
        user = userMapper.findById(user.getId());
        String status = user.getStatus();
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Timestamp source = user.getInterview_time();
        long interval = (source.getTime()-now.getTime())/1000;
        if ("0".equals(status)) {
            return "该用户未注册！";
        } else if ("3".equals(status)) {
            if (interval > 7200L){
                return ("系统未开放：\n" +
                        "  面试还未开始，请面试开始后到指定地点后再签到");
            }
            userMapper.clockUserById(user.getId());
            return ("打卡成功！\n"+
                    "面试时间为："+user.getInterview_time()+
                    "面试地点为："+user.getRoom());
        }else if ("5".equals(status)){
            return "请勿重复打卡！";
        }else{
            return "error";
        }
    }

    @PostMapping(path = "/deluser")
    public @ResponseBody
    String delUserByUserName(@RequestBody User user) {
        userMapper.delUserById(user.getId());
        return "User Deleted!";
    }
}