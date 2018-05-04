package com.mapper;

import com.model.Client;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AgesMapper {

    @Insert("insert into client(name) values(#{name})")
    void insertClient(Client client);
}
