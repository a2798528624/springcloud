package com.zsb.risk.pojo;

import lombok.Data;

@Data
public class Risk {
    private  int id;
    private  String name;
    private  String region;
    private  String data1;
    private  String data2;
    public   String data;
    private  boolean critical;
    private  String  desc;

}
