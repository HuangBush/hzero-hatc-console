package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.TaskDetail;
import org.hzero.hatc.domain.repository.TaskDetailRepository;
import org.hzero.hatc.infra.mapper.TaskDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/**
 * TaskDetailRopository的实现类
 * @author jiayanyan 2019/06/09
 */
public class TaskDetailRepositoryImpl implements TaskDetailRepository {
    private TaskDetailMapper taskDetailMapper;

    @Autowired
    public TaskDetailRepositoryImpl(TaskDetailMapper taskDetailMapper) {
        this.taskDetailMapper = taskDetailMapper;
    }

    @Override
    public void deleteByTaskId(Long taskId) {
        TaskDetail taskDetail = new TaskDetail();
        taskDetail.setTaskId(taskId);
       taskDetailMapper.delete(taskDetail);
    }
}
