package com.zsb.risk.pojo;

import lombok.Data;

@Data
public class QueryInfo {
    private String query ="";
    private int pageNum =1 ;
    private int pageSize =1;
}
