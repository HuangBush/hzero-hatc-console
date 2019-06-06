package org.hzero.hatc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@ModifyAudit
@VersionAudit
@Table(name = "hcsl_project_relation")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectRelation {
    @GeneratedValue
    @Id
    private Long relation_id;
    private Long projectId;
    private Long userId;
    private Long roleId;
    private String worker_seniority;
    private Long tenantId;
    private Long objectVersionNumber;
    private Long createdBy;
    private Date creationDate;
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
    private String projectNum;
    private String stageCode;

    public ProjectRelation(Long relation_id, Long userId, Long roleId, String worker_seniority, Long tenantId, Long objectVersionNumber, Long createdBy, Date creationDate, Long lastUpdatedBy, Date lastUpdateDate, Long lastUpdateLogin, String attributeCategory, String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6, String attribute7, String attribute8, String attribute9, String attribute10, String attribute11, String attribute12, String attribute13, String attribute14, String attribute15, String projectNum, String stageCode) {
        this.relation_id = relation_id;
        this.userId = userId;
        this.roleId = roleId;
        this.worker_seniority = worker_seniority;
        this.tenantId = tenantId;
        this.objectVersionNumber = objectVersionNumber;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
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
        this.projectNum = projectNum;
        this.stageCode = stageCode;
    }

    public ProjectRelation() {
    }

    @Override
    public String toString() {
        return "ProjectRelation{" +
                "projectId=" + projectId +
                ", relation_id=" + relation_id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", worker_seniority='" + worker_seniority + '\'' +
                ", tenantId=" + tenantId +
                ", objectVersionNumber=" + objectVersionNumber +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
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
                ", projectNum='" + projectNum + '\'' +
                ", stageCode='" + stageCode + '\'' +
                '}';
    }

    public Long getProjectId() {
        return projectId;
    }

    public Long getRelation_id() {
        return relation_id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public String getWorker_seniority() {
        return worker_seniority;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public String getProjectNum() {
        return projectNum;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public void setRelation_id(Long relation_id) {
        this.relation_id = relation_id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setWorker_seniority(String worker_seniority) {
        this.worker_seniority = worker_seniority;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }
}
