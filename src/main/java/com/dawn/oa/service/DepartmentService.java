package com.dawn.oa.service;

import com.dawn.oa.entity.Department;
import com.dawn.oa.mapper.DepartmentMapper;
import com.dawn.oa.utils.MybatisUtils;

public class DepartmentService {
    public Department selectById(Long departmentId){
        return (Department)MybatisUtils.executeQuery(sqlSession -> sqlSession.getMapper(DepartmentMapper.class).selectById(departmentId));
    }
}
