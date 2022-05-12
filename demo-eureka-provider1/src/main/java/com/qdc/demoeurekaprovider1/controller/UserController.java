package com.qdc.demoeurekaprovider1.controller;

import com.qdc.demoeurekaprovider1.pojo.User;
import com.qdc.demoeurekaprovider1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;
    //addUser  方法接受前端传过来的数据也是json模式
    //把json模式转换为user对象

    @Value("${spring.cloud.client.ip-address}")
    String ipaddr;
    @Value("${server.port}")
    int port;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
        return userService.updataUser(user);
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public boolean delUser(@RequestParam(value = "username",required = true) String name ) {
        return userService.deleteUser(name);
    }

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public User selectUserById(@RequestParam(value = "userid",required = true) String id){
        return userService.selectUserById(id);
    }

    @RequestMapping(value = "/userall",method = RequestMethod.GET)

    public List<User> selectUserById(){
        return userService.selectAllUser();
    }


    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "sleep_seconds",required = true) int sleep_seconds) throws InterruptedException{
        System.out.println("休眠时间"+sleep_seconds);
        Thread.sleep(sleep_seconds*2);
        return "Hello,刘日星大潮八"+ipaddr+":"+port;

    }

}