package org.sko.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sko.domain.User;

@Mapper
public interface UserMapper {

    List<User> selectAll();

}
