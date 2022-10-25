package com.example.demo.service.project.impl;

import com.example.demo.controller.project.ProjectRequest;
import com.example.demo.entities.Project;
import com.example.demo.mapper.ProjectMapper;
import com.example.demo.service.project.ProjectResult;
import com.example.demo.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public ProjectResult getProject(ProjectRequest request) {
        ProjectResult result = new ProjectResult();
        request.setUserId("003422");
        result.setList(projectMapper.getProjectList(request));
        return result;
    }

    @Override
    public Project getProjectId(String projectId) {
        return projectMapper.getProjectId(projectId);
    }
}
