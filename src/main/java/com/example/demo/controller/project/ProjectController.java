package com.example.demo.controller.project;

import com.example.demo.entities.Project;
import com.example.demo.service.project.ProjectResult;
import com.example.demo.service.project.ProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    @Transactional(readOnly = true)
    public ProjectResonse getProject(ProjectRequest request) {

        ProjectResult result = projectService.getProject(request);

        ProjectResonse response = new ProjectResonse();
        BeanUtils.copyProperties(result, response);
        return response;
    }

    @GetMapping("/project/{id}")
    @Transactional(readOnly = true)
    public Project getProjectId(@PathVariable("id") String projectId) {

        return projectService.getProjectId(projectId);
    }
}
