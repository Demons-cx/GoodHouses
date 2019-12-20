package com.xin.mapper;

import com.xin.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: ChenXin
 * @time: 2019/11/27 4:42 下午
 */
@Mapper
public interface UserMapper {

    public List<User> selectUsers();
}
