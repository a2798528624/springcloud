package cn.itcast.user.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String role;
    private String risk;
}