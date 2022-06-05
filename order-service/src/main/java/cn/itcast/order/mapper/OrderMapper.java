package cn.itcast.order.mapper;

import cn.itcast.order.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;



public interface OrderMapper extends BaseMapper<Order> {

//    @Select("select * from tb_order where id = #{id}")
//    Order findById(Long id);
}
