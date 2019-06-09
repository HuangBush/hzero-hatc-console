package org.hzero.hatc.app.service;

/**
 * TaskDetail方法接口
 * @author jiayanyan 2019/06/09
 */
public interface TaskDetailService {
    /**
     * 根据TaskDetail的id删除对象信息
     * @param taskId
     */
    void deleteByTaskId(Long taskId);
}
