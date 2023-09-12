package com.example.mybatis.mapper;

import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(name, email) values(#{name}, #{email})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Integer.class)
    void addOne(User user);

    @Select("select * from user where id = #{id}")
    User findOne(int id);

    @Update("update user set name = #{name}, email = #{email} where id = #{id}")
    void updateOne(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUser(int id);
}
