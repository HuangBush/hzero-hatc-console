package org.hzero.hatc.api.controller.v1;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.util.Results;
import org.hzero.hatc.app.service.TaskService;
import org.hzero.hatc.domain.entity.Task;
import org.hzero.hatc.domain.entity.TaskProject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.Date;

@RestController
@RequestMapping(value = "v1/task")
/**
 * Task 用户接口类
 * @author jiayanyan 2019/06/05
 */
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping()
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "创建task")
    public ResponseEntity<Task> create(@RequestBody Task task){
        return Results.success(taskService.create(task));
    }

    @GetMapping("/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "查询task")
    public ResponseEntity<TaskProject> query(@PathVariable Long id){
        return Results.success(taskService.queryById(id));
    }

    @DeleteMapping("/delete/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据id删除task")
    public void delete(@PathVariable Long id){
        taskService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "更新task")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody Task task){
        System.out.println("update:"+task);
        task.setTaskId(id);
        return Results.success(taskService.update(task));
    }
}
