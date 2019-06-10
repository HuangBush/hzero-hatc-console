package org.hzero.hatc.domain.repository;

import org.hzero.hatc.domain.entity.Task;

/**
 * Task方法接口
 * @author jiayanyan 2019/06/05
 */
public interface TaskRepository {
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
    Task queryById(Long id);
}
