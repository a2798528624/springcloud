package cn.itcast.order;

import cn.itcast.order.mapper.OrderMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class OrderApplicationTest {
    @Autowired
    OrderMapper orderMapper;

    @Test
    public void test(){
        System.out.println(orderMapper==null);
    }
}
