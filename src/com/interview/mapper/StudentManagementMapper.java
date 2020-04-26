package com.interview.mapper;

import com.interview.po.StudentManagement;
import com.interview.po.StudentManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentManagementMapper {
    long countByExample(StudentManagementExample example);

    int deleteByExample(StudentManagementExample example);

    int deleteByPrimaryKey(String studentId);

    int insert(StudentManagement record);

    int insertSelective(StudentManagement record);

    List<StudentManagement> selectByExample(StudentManagementExample example);

    StudentManagement selectByPrimaryKey(String studentId);

    int updateByExampleSelective(@Param("record") StudentManagement record, @Param("example") StudentManagementExample example);

    int updateByExample(@Param("record") StudentManagement record, @Param("example") StudentManagementExample example);

    int updateByPrimaryKeySelective(StudentManagement record);

    int updateByPrimaryKey(StudentManagement record);
}