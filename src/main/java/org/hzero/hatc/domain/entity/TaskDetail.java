package org.hzero.hatc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ModifyAudit
@VersionAudit
@Table(name = "hcsl_task_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * 任务明细表对象
 * @author jiayanyan 2019/06/09
 */
public class TaskDetail extends AuditDomain {
    @Id
    @GeneratedValue
    private Long detailId;
    private Long taskId;
    private String attachmentUuid;
    private Long processDuration;
    private Long amount;
    private String processStatus;
    private String processType;

    public TaskDetail() {
    }

    public TaskDetail(Long detailId, Long taskId, String attachmentUuid, Long processDuration, Long amount, String processStatus, String processType) {
        this.detailId = detailId;
        this.taskId = taskId;
        this.attachmentUuid = attachmentUuid;
        this.processDuration = processDuration;
        this.amount = amount;
        this.processStatus = processStatus;
        this.processType = processType;
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getAttachmentUuid() {
        return attachmentUuid;
    }

    public void setAttachmentUuid(String attachmentUuid) {
        this.attachmentUuid = attachmentUuid;
    }

    public Long getProcessDuration() {
        return processDuration;
    }

    public void setProcessDuration(Long processDuration) {
        this.processDuration = processDuration;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    @Override
    public String toString() {
        return "TaskDetail{" +
                "detailId=" + detailId +
                ", taskId=" + taskId +
                ", attachmentUuid='" + attachmentUuid + '\'' +
                ", processDuration=" + processDuration +
                ", amount=" + amount +
                ", processStatus='" + processStatus + '\'' +
                ", processType='" + processType + '\'' +
                '}';
    }
}
