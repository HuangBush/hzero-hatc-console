package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.Task;
import org.hzero.hatc.domain.repository.TaskRepositiory;
import org.hzero.hatc.infra.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/8
 */
@Component
public class TaskRepositoryImpl implements TaskRepositiory {

    private TaskMapper taskMapper;

    @Autowired
    public TaskRepositoryImpl(TaskMapper taskMapper){
        this.taskMapper = taskMapper;
    }

    @Override
    public void delete(Long id) {
        if(taskMapper.selectByPrimaryKey(id) == null){
            throw  new CommonException("error.task.not.exist");
        }
        if(taskMapper.deleteByPrimaryKey(id) != 1){
            throw  new CommonException("error.task.delete");
        }
    }

    @Override
    public Task queryById(Long id) {
        return taskMapper.selectByPrimaryKey(id);
    }
}
