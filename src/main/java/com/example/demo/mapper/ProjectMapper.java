package com.example.demo.mapper;

import com.example.demo.controller.project.ProjectRequest;
import com.example.demo.entities.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {

    List<Project> getProjectList(ProjectRequest condition);
}
