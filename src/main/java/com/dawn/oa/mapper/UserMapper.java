package com.dawn.oa.mapper;

import com.dawn.oa.entity.User;
import com.dawn.oa.utils.MybatisUtils;

public class UserMapper {
    public User selectByUsername(String username){
        User user = (User)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername", username));
        return user;
    }
}
