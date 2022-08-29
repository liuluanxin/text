package com.example.demo.mapper;

import com.example.demo.entities.WorkTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WorkTimeMapper {
    WorkTime getWorkTime(@Param("userId") String userId, @Param("targetDate") String targetDate,
                         @Param("projectId") String projectId);
}
