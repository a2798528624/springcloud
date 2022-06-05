package cn.itcast.order.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_order")
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    //private User user;
}