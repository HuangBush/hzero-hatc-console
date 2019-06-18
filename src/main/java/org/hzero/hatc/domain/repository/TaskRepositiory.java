package org.hzero.hatc.domain.repository;

import org.hzero.hatc.domain.entity.Task;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/7
 */
public interface TaskRepositiory {

    /**
     * 根据任务id删除任务
     * @param id
     */
    void delete(Long id);

    /**
     * 根据id查询任务
     * @param id
     * @return
     */
    Task queryById(Long id);
}
