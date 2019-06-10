package org.hzero.hatc.app.service;

import org.hzero.hatc.domain.entity.Task;
import org.hzero.hatc.domain.entity.TaskProject;

/**
 * Task Service层接口
 * @author jiayanyan 2019/06/05
 */
public interface TaskService {
    /**
     * 创建一个hcslTask对象信息
     * @param task
     * @return
     */
    Task create(Task task);

    /**
     * 根据hcslTask的id删除对象信息
     * @param id
     */
    void deleteById(Long id);

    /**
     * 修改hcslTask对象的信息
     * @param task
     * @return
     */
    Task update(Task task);

    /**
     * 根据hcslTask编号查询对象信息
     * @param id
     * @return
     */
    TaskProject queryById(Long id);
}
