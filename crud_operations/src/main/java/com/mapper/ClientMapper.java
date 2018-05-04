package com.mapper;

import com.model.Client;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface ClientMapper {

    @Insert("insert into client(name) values(#{name})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
//    @SelectKey(statement="call identity()", keyProperty="id",
//            before=false, resultType=Integer.class)
    void insertClient(Client client);

}
