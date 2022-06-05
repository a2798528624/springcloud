package cn.itcast.user.mapper;

import cn.itcast.user.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    
    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") int id);

    @Select("select * from tb_user where username=#{username} and password=#{password}")
    User getUserByMessage(@Param("username") String username,@Param("password") String password);

    List<User> findAllUser(@Param("username") String username,@Param("pageStart")int pageStart,@Param("pageSize")int pageSize);

    int getUserCount(@Param("username")String username);

    @Insert("INSERT  into tb_user(username,password,role) values (#{username},#{password},#{role}) ")
    int addUser(User user);

    @Delete("DELETE  from tb_user where id = #{id}")
    int delUser(int id);
}