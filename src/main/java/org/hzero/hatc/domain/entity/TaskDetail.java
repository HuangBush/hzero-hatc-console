package org.hzero.hatc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import java.math.BigDecimal;
import java.util.Date;


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

    private BigDecimal amount;

    private String processStatus;

    private String processType;

    private Long processUserId;

    private Date commitDate;

    private Date processStartDate;

    private Date processEndDate;

    private Long tenantId;

    private Long objectVersionNumber;

    private Date creationDate;

    private Long createdBy;

    private Long lastUpdatedBy;

    private Date lastUpdateDate;

    private Long lastUpdateLogin;

    private String attributeCategory;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;

    private String email;

    private String processTypeDesc;

    public TaskDetail(Long detailId, Long taskId, String attachmentUuid, Long processDuration, BigDecimal amount, String processStatus, String processType, Long processUserId, Date commitDate, Date processStartDate, Date processEndDate, Long tenantId, Long objectVersionNumber, Date creationDate, Long createdBy, Long lastUpdatedBy, Date lastUpdateDate, Long lastUpdateLogin, String attributeCategory, String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6, String attribute7, String attribute8, String attribute9, String attribute10, String attribute11, String attribute12, String attribute13, String attribute14, String attribute15, String email, String processTypeDesc) {
        this.detailId = detailId;
        this.taskId = taskId;
        this.attachmentUuid = attachmentUuid;
        this.processDuration = processDuration;
        this.amount = amount;
        this.processStatus = processStatus;
        this.processType = processType;
        this.processUserId = processUserId;
        this.commitDate = commitDate;
        this.processStartDate = processStartDate;
        this.processEndDate = processEndDate;
        this.tenantId = tenantId;
        this.objectVersionNumber = objectVersionNumber;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateLogin = lastUpdateLogin;
        this.attributeCategory = attributeCategory;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.attribute10 = attribute10;
        this.attribute11 = attribute11;
        this.attribute12 = attribute12;
        this.attribute13 = attribute13;
        this.attribute14 = attribute14;
        this.attribute15 = attribute15;
        this.email = email;
        this.processTypeDesc = processTypeDesc;
    }

    public TaskDetail() {
        super();
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
        this.attachmentUuid = attachmentUuid == null ? null : attachmentUuid.trim();

    }

    public Long getProcessDuration() {
        return processDuration;
    }

    public void setProcessDuration(Long processDuration) {
        this.processDuration = processDuration;
    }



    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {

        this.amount = amount;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();

    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType == null ? null : processType.trim();
    }

    public Long getProcessUserId() {
        return processUserId;
    }

    public void setProcessUserId(Long processUserId) {
        this.processUserId = processUserId;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public Date getProcessStartDate() {
        return processStartDate;
    }

    public void setProcessStartDate(Date processStartDate) {
        this.processStartDate = processStartDate;
    }

    public Date getProcessEndDate() {
        return processEndDate;
    }

    public void setProcessEndDate(Date processEndDate) {
        this.processEndDate = processEndDate;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory == null ? null : attributeCategory.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11 == null ? null : attribute11.trim();
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12 == null ? null : attribute12.trim();
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13 == null ? null : attribute13.trim();
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14 == null ? null : attribute14.trim();
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15 == null ? null : attribute15.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProcessTypeDesc() {
        return processTypeDesc;
    }

    public void setProcessTypeDesc(String processTypeDesc) {
        this.processTypeDesc = processTypeDesc == null ? null : processTypeDesc.trim();
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
                ", processUserId=" + processUserId +
                ", commitDate=" + commitDate +
                ", processStartDate=" + processStartDate +
                ", processEndDate=" + processEndDate +
                ", tenantId=" + tenantId +
                ", objectVersionNumber=" + objectVersionNumber +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdateLogin=" + lastUpdateLogin +
                ", attributeCategory='" + attributeCategory + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                ", attribute11='" + attribute11 + '\'' +
                ", attribute12='" + attribute12 + '\'' +
                ", attribute13='" + attribute13 + '\'' +
                ", attribute14='" + attribute14 + '\'' +
                ", attribute15='" + attribute15 + '\'' +
                ", email='" + email + '\'' +
                ", processTypeDesc='" + processTypeDesc + '\'' +
                '}';
    }
}

