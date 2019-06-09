package org.hzero.hatc.app.service.impl;

import org.hzero.hatc.app.service.TaskDetailService;
import org.hzero.hatc.domain.repository.TaskDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/**
 * TaskService 接口的实现类
 * @author jiayanyan 2019/06/05
 */
public class TaskDetailServiceImpl implements TaskDetailService {
    private TaskDetailRepository taskDetailRepository;

    @Autowired
    public TaskDetailServiceImpl(TaskDetailRepository taskDetailRepository) {
        this.taskDetailRepository = taskDetailRepository;
    }

    @Override
    public void deleteByTaskId(Long taskId) {
        taskDetailRepository.deleteByTaskId(taskId);
    }
}
