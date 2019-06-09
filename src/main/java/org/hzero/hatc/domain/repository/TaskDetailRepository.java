package org.hzero.hatc.domain.repository;

/**
 * TaskDetail方法接口
 * @author jiayanyan 2019/06/09
 */
public interface TaskDetailRepository {
    /**
     * 根据TaskDetail的id删除对象信息
     * @param taskId
     */
    void deleteByTaskId(Long taskId);
}
