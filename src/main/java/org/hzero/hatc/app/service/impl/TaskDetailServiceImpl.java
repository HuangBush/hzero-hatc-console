package org.hzero.hatc.app.service.impl;


import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.app.service.TaskDetailService;
import org.hzero.hatc.domain.entity.TaskDetail;
import org.hzero.hatc.domain.repository.TaskDetailRepository;
import org.hzero.hatc.domain.repository.TaskRepositiory;
import org.hzero.hatc.infra.mapper.TaskDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/8
 */
@Service
public class TaskDetailServiceImpl implements TaskDetailService {

    private TaskDetailRepository taskDetailRepository;
    private TaskRepositiory taskRepositiory;

    @Autowired
    public TaskDetailServiceImpl(TaskRepositiory taskRepositiory,TaskDetailRepository taskDetailRepository){
        this.taskDetailRepository = taskDetailRepository;
        this.taskRepositiory = taskRepositiory;
    }
  
    @Override
    public void deleteByTaskId(Long taskId) {
        taskDetailRepository.deleteByTaskId(taskId);

    @Override
    public TaskDetail create(TaskDetail taskDetail) {
        //查询任务id是否存在
        if(taskRepositiory.queryById(taskDetail.getTaskId()) == null){
            throw new CommonException("error.task.not.exist");
        }else{
            //如果存在则增加对应的任务详细
            return taskDetailRepository.create(taskDetail);
        }
    }

    /**
     * 根据任务详细id删除任务详细
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        taskDetailRepository.deleteById(id);
    }

    @Override
    public TaskDetail queryById(Long id) {
        return taskDetailRepository.queryById(id);
    }

    @Override
    public List<TaskDetail> queryByTaskId(Long id) {
        return taskDetailRepository.queryByTaskId(id);
    }

    @Override
    public TaskDetail update(TaskDetail taskDetail) {
        return taskDetailRepository.update(taskDetail);

    }
}
