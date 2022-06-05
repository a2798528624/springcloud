package cn.itcast.user.web;

import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@Slf4j
@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") int id) {
        return userService.queryById(id);
    }
    @RequestMapping("/login")
    public String login(@RequestBody User user){
        HashMap<String, Object> map = new HashMap<>();
        String tag = "ok";
        User us = userService.getUserByMessage(user.getUsername(),user.getPassword());
        if(us==null){
            tag = "false";
        }
        map.put("user",us);
        map.put("tag",tag);
        String res = JSON.toJSONString(map);
        return res;
    }
    @RequestMapping("/alluser")
    public String getAllUser(@RequestBody QueryInfo queryInfo){

         int number = userService.getUserCount("%"+queryInfo.getQuery()+"%");
         int pageStart = (queryInfo.getPageNum()-1) * queryInfo.getPageSize();

         List<User> users = userService.getAllUsers("%"+queryInfo.getQuery()+"%",pageStart,queryInfo.getPageSize());

         HashMap<String,Object> res = new HashMap<>();

         res.put("number",number);

         res.put("users",users);
         String res_s = JSON.toJSONString(res);
        System.out.println(res_s);
         return res_s;
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        int check = userService.addUser(user);
        String res = (check!=0)? "success":"error";
        return res;
    }
    @GetMapping("/delUser")
    public  String delUser(@RequestParam(name="id") int id){
        int check =  userService.delUser(id);
        String res = (check!=0)?"success":"error";
        return res;
    }
}
