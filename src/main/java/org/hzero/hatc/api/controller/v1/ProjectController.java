package org.hzero.hatc.api.controller.v1;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.util.Results;
import org.hzero.hatc.app.service.ProjectService;
import org.hzero.hatc.domain.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author zhang
 */
@RestController
@RequestMapping(value = "/v1/project")
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @PostMapping()
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "创建project")
    public ResponseEntity<Project> create(@RequestBody Project project) {
        project.setProjectCreateDate(new Date());
        return Results.success(projectService.create(project));
    }

    @DeleteMapping("/delete/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据id删除project")
    public void delete(@PathVariable Long id) {
        projectService.deleteById(id);
    }


    @PutMapping("/update/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "更新project")
    public ResponseEntity<Project> update(@PathVariable Long id, @RequestBody Project project) {
        project.setProjectId(id);
        return Results.success(projectService.update(project));
    }

    @GetMapping("/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "查询project")
    public ResponseEntity<Project> query(@PathVariable Long id) {
        return Results.success(projectService.queryById(id));
    }

}
