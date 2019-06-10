package org.hzero.hatc.app.service.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.app.service.TaskService;
import org.hzero.hatc.domain.entity.Project;
import org.hzero.hatc.domain.entity.Task;
import org.hzero.hatc.domain.entity.TaskProject;
import org.hzero.hatc.domain.repository.ProjectRepository;
import org.hzero.hatc.domain.repository.TaskDetailRepository;
import org.hzero.hatc.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
/**
 * TaskService 接口的实现类
 * @author jiayanyan 2019/06/05
 */
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;
    private ProjectRepository projectRepository;
    private TaskDetailRepository taskDetailRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, ProjectRepository projectRepository, TaskDetailRepository taskDetailRepository) {
        this.taskRepository = taskRepository;
        this.projectRepository = projectRepository;
        this.taskDetailRepository = taskDetailRepository;
    }

    public TaskServiceImpl(TaskRepository taskRepository, ProjectRepository projectRepository) {
        this.taskRepository = taskRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public Task create(Task task) {
        return taskRepository.create(task);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
        taskDetailRepository.deleteByTaskId(id);
    }

    @Override
    public Task update(Task hcslTask) {
        return taskRepository.update(hcslTask);
    }

    @Override
    public TaskProject queryById(Long id) {
        TaskProject taskProject = new TaskProject();
        Task task = taskRepository.queryById(id);
        Project project = projectRepository.queryById(task.getProjectId());
        taskProject.setTask(task);
        taskProject.setProject(project);
        System.out.println(project);
        return taskProject;
    }
}
