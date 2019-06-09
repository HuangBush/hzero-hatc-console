package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.Task;
import org.hzero.hatc.domain.repository.TaskRepository;
import org.hzero.hatc.infra.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
/**
 * TaskRopository的实现类
 * @author jiayanyan 2019/06/05
 */
public class TaskRepositoryImpl implements TaskRepository {

    private TaskMapper taskMapper;

    @Autowired
    public TaskRepositoryImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Task create(Task hcslTask) {
        List<Task> hcslTaskList = taskMapper.select(hcslTask);
        if(!hcslTaskList.isEmpty()){
            throw  new CommonException("error.repo.create.hcslTask.exist");
        }
        if(taskMapper.insertSelective(hcslTask) != 1){
            throw  new CommonException("error.repo.create.hcslTask.failed");
        }
        return taskMapper.selectByPrimaryKey(hcslTask.getTaskId());
    }

    @Override
    public void deleteById(Long id) {
        if(taskMapper.selectByPrimaryKey(id) == null){
            throw new CommonException("error.hcslTask.not.exist");
        }
        if(taskMapper.deleteByPrimaryKey(id) != 1){
            throw new CommonException("error.hcslTask.delete");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Task update(Task task) {
        if(taskMapper.updateByPrimaryKeySelective(task) != 1){
            throw new CommonException("error.hcslTask.update");
        }
        return taskMapper.selectByPrimaryKey(task.getTaskId());
    }

    @Override
    public Task queryById(Long id) {
        return taskMapper.selectByPrimaryKey(id);
    }
}
