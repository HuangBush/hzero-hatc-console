package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.TaskDetail;
import org.hzero.hatc.domain.repository.TaskDetailRepository;
import org.hzero.hatc.infra.mapper.TaskDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/7
 */
@Component
public class TaskDetailRepositoryImpl implements TaskDetailRepository {

    private TaskDetailMapper taskDetailMapper;

    @Autowired
    public TaskDetailRepositoryImpl(TaskDetailMapper taskDetailMapper){
        this.taskDetailMapper = taskDetailMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public TaskDetail create(TaskDetail taskDetail) {
        List<TaskDetail> taskDetailList = taskDetailMapper.select(taskDetail);
        if(!taskDetailList.isEmpty()){
            throw new CommonException("error.repo.create.taskDetail.exist");
        }
        if(taskDetailMapper.insertSelective(taskDetail) != 1){
            throw new CommonException("error.repo.create.taskDetail.failed");
        }
        return taskDetailMapper.selectByPrimaryKey(taskDetail.getDetailId());
    }

    @Override
    public void deleteById(Long id) {
        if(taskDetailMapper.selectByPrimaryKey(id) == null){
            throw new CommonException("error.taskDetail.not.exist");
        }
        if(taskDetailMapper.deleteByPrimaryKey(id) != 1){
            throw new CommonException("error.taskDetail.delete");
        }

    }

    @Override
    public TaskDetail queryById(Long id) {
        return taskDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TaskDetail> queryByTaskId(Long id) {
        return taskDetailMapper.selectByTaskId(id);
    }

    @Override
    public TaskDetail update(TaskDetail taskDetail) {
        if(taskDetailMapper.updateByPrimaryKeySelective(taskDetail) != 1){
            throw new CommonException("error.project.update");
        }
        return taskDetailMapper.selectByPrimaryKey(taskDetail.getDetailId());
    }
}
