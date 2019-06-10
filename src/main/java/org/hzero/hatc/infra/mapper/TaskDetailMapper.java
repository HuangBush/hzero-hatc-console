package org.hzero.hatc.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.hzero.hatc.domain.entity.TaskDetail;

import javax.ws.rs.Path;
import java.util.List;

/**
 * @author huangyifeng.test@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/6/7
 */
public interface TaskDetailMapper extends BaseMapper<TaskDetail> {

    /**
     * 根据任务id获取任务详情
     * @param id
     * @return
     */
    @Select("select * from hcsl_task_detail where task_id = #{id}")
    List<TaskDetail> selectByTaskId(@Param("id") Long id);
}
