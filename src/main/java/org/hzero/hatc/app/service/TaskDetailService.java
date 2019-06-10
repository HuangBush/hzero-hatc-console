package org.hzero.hatc.app.service;

import org.hzero.hatc.domain.entity.TaskDetail;

import java.util.List;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/8
 */
public interface TaskDetailService {

    /**
     * 根据TaskDetail的id删除对象信息
     * @param taskId
     */
    void deleteByTaskId(Long taskId);

    /**
     * 增加任务详细
     * @param taskDetail
     * @return
     */
    TaskDetail create(TaskDetail taskDetail);

    /**
     * 根据id删除任务详细
     * @param id
     */
    void deleteById(Long id);

    /**
     * 根据任务详细id查询任务
     * @param id
     * @return
     */
    TaskDetail queryById(Long id);

    /**
     * 根据任务id查询所有任务详细
     * @param id
     * @return
     */
    List<TaskDetail> queryByTaskId(Long id);

    /**
     * 修改任务详细
     * @param taskDetail
     * @return
     */
    TaskDetail update(TaskDetail taskDetail);

}
