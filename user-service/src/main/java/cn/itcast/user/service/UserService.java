package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User queryById(int id) {
        return userMapper.findById(id);
    }

    public User getUserByMessage(String username,String password){
        return userMapper.getUserByMessage(username,password);
    }

    public List<User> getAllUsers(String name,int pageStart,int pageSize){
        return userMapper.findAllUser(name,pageStart,pageSize);
    }

    public int getUserCount(String name){
        return userMapper.getUserCount(name);
    }

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    public int delUser(int id){
        return userMapper.delUser(id);
    }
}