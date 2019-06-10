package org.hzero.hatc.api.controller.v1;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.util.Results;
import org.hzero.hatc.app.service.TaskDetailService;
import org.hzero.hatc.domain.entity.TaskDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/8
 */
@RestController
@RequestMapping(value = "/v1/taskDetail")
public class TaskDetailController {

    private TaskDetailService taskDetailService;

    @Autowired
    public TaskDetailController(TaskDetailService taskDetailService){
        this.taskDetailService=taskDetailService;
    }

    @GetMapping("1/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据任务详细id查询任务详细")
    public ResponseEntity<TaskDetail> query(@PathVariable Long id){
        TaskDetail taskDetail = taskDetailService.queryById(id);
        return Results.success(taskDetail);
    }

    @GetMapping("2/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据任务id查询所有任务详细")
    public ResponseEntity<List<TaskDetail>> queryByTaskId(@PathVariable Long id){
        return Results.success(taskDetailService.queryByTaskId(id));
    }

    @DeleteMapping("/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据任务详细id删除任务详细")
    public void delete(@PathVariable Long id){
        taskDetailService.deleteById(id);
    }

    @PostMapping()
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "增加新的任务详细")
    public ResponseEntity<TaskDetail>  create(@RequestBody TaskDetail taskDetail){
        System.out.println("________________________"+taskDetail);
        return Results.success(taskDetailService.create(taskDetail));
    }

    @PutMapping("/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "修改任务详细")
    public ResponseEntity<TaskDetail> update(@PathVariable Long id,@RequestBody TaskDetail taskDetail){
        taskDetail.setDetailId(id);
        System.out.println("++++++++++++++++++++++++++++"+taskDetail);
        return Results.success(taskDetailService.update(taskDetail));
    }
}
