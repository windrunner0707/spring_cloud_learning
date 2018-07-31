package com.baiqiqi.server.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountMapper {

    @Insert("insert into account(name,money) values (#{name},#{money})")
    int add(@Param("name") String name, @Param("money") double money);

}
