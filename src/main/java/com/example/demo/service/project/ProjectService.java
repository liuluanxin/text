package com.example.demo.service.project;

import com.example.demo.controller.project.ProjectRequest;
import com.example.demo.entities.Project;

public interface ProjectService {

    ProjectResult getProject(ProjectRequest request);

    Project getProjectId(String projectId);
}
