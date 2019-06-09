package org.hzero.hatc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ModifyAudit
@VersionAudit
@Table(name = "hcsl_task")
@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * 任务表对象
 * @author jiayanyan 2019/06/05
 */
public class Task extends AuditDomain {
    @Id
    @GeneratedValue
    private Long taskId;
    private String  taskNum;
    private String taskName;
    private Date lastSuccessDate;
    private Date lastFailDate;
    private Long processTimes;
    private Long projectId;
    private Long tenantId;
    private Long objectVersionNumber;

    public Task() {
    }

    public Task(String taskNum, String taskName, Date lastSuccessDate, Date lastFailDate, Long processTimes, Long projectId, Long tenantId, Long objectVersionNumber) {
        this.taskNum = taskNum;
        this.taskName = taskName;
        this.lastSuccessDate = lastSuccessDate;
        this.lastFailDate = lastFailDate;
        this.processTimes = processTimes;
        this.projectId = projectId;
        this.tenantId = tenantId;
        this.objectVersionNumber = objectVersionNumber;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getLastSuccessDate() {
        return lastSuccessDate;
    }

    public void setLastSuccessDate(Date lastSuccessDate) {
        this.lastSuccessDate = lastSuccessDate;
    }

    public Date getLastFailDate() {
        return lastFailDate;
    }

    public void setLastFailDate(Date lastFailDate) {
        this.lastFailDate = lastFailDate;
    }

    public Long getProcessTimes() {
        return processTimes;
    }

    public void setProcessTimes(Long processTimes) {
        this.processTimes = processTimes;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    @Override
    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskNum='" + taskNum + '\'' +
                ", taskName='" + taskName + '\'' +
                ", lastSuccessDate=" + lastSuccessDate +
                ", lastFailDate=" + lastFailDate +
                ", processTimes=" + processTimes +
                ", projectId=" + projectId +
                ", tenantId=" + tenantId +
                ", objectVersionNumber=" + objectVersionNumber +
                '}';
    }
}

