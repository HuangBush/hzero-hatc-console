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
@Table(name = "hcsl_module_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModuleDetail {
    @GeneratedValue
    @Id
    private Long module_id;
    private Long monitor_id;
    private String module_type_code;
    private Long quantity;
    private String module_code;
    private String module_name;
    private String module_remark;
    private Long tenant_id;
    private Long object_version_number;
    private Long CREATED_BY;
    private Date CREATION_DATE;
    private Long LAST_UPDATED_BY;
    private Date LAST_UPDATE_DATE;
    private Long LAST_UPDATE_LOGIN;

    public ModuleDetail(Long monitor_id, String module_type_code, Long quantity, String module_code, String module_name, String module_remark, Long tenant_id, Long object_version_number, Long CREATED_BY, Date CREATION_DATE, Long LAST_UPDATED_BY, Date LAST_UPDATE_DATE, Long LAST_UPDATE_LOGIN) {
        this.monitor_id = monitor_id;
        this.module_type_code = module_type_code;
        this.quantity = quantity;
        this.module_code = module_code;
        this.module_name = module_name;
        this.module_remark = module_remark;
        this.tenant_id = tenant_id;
        this.object_version_number = object_version_number;
        this.CREATED_BY = CREATED_BY;
        this.CREATION_DATE = CREATION_DATE;
        this.LAST_UPDATED_BY = LAST_UPDATED_BY;
        this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
        this.LAST_UPDATE_LOGIN = LAST_UPDATE_LOGIN;
    }

    public ModuleDetail() {
    }

    @Override
    public String toString() {
        return "ModuleDetail{" +
                "module_id=" + module_id +
                ", monitor_id=" + monitor_id +
                ", module_type_code='" + module_type_code + '\'' +
                ", quantity=" + quantity +
                ", module_code='" + module_code + '\'' +
                ", module_name='" + module_name + '\'' +
                ", module_remark='" + module_remark + '\'' +
                ", tenant_id=" + tenant_id +
                ", object_version_number=" + object_version_number +
                ", CREATED_BY=" + CREATED_BY +
                ", CREATION_DATE=" + CREATION_DATE +
                ", LAST_UPDATED_BY=" + LAST_UPDATED_BY +
                ", LAST_UPDATE_DATE=" + LAST_UPDATE_DATE +
                ", LAST_UPDATE_LOGIN=" + LAST_UPDATE_LOGIN +
                '}';
    }

    public Long getModule_id() {
        return module_id;
    }

    public void setModule_id(Long module_id) {
        this.module_id = module_id;
    }

    public Long getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(Long monitor_id) {
        this.monitor_id = monitor_id;
    }

    public String getModule_type_code() {
        return module_type_code;
    }

    public void setModule_type_code(String module_type_code) {
        this.module_type_code = module_type_code;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getModule_code() {
        return module_code;
    }

    public void setModule_code(String module_code) {
        this.module_code = module_code;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getModule_remark() {
        return module_remark;
    }

    public void setModule_remark(String module_remark) {
        this.module_remark = module_remark;
    }

    public Long getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Long tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Long getObject_version_number() {
        return object_version_number;
    }

    public void setObject_version_number(Long object_version_number) {
        this.object_version_number = object_version_number;
    }

    public Long getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(Long CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public Date getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(Date CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public Long getLAST_UPDATED_BY() {
        return LAST_UPDATED_BY;
    }

    public void setLAST_UPDATED_BY(Long LAST_UPDATED_BY) {
        this.LAST_UPDATED_BY = LAST_UPDATED_BY;
    }

    public Date getLAST_UPDATE_DATE() {
        return LAST_UPDATE_DATE;
    }

    public void setLAST_UPDATE_DATE(Date LAST_UPDATE_DATE) {
        this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
    }

    public Long getLAST_UPDATE_LOGIN() {
        return LAST_UPDATE_LOGIN;
    }

    public void setLAST_UPDATE_LOGIN(Long LAST_UPDATE_LOGIN) {
        this.LAST_UPDATE_LOGIN = LAST_UPDATE_LOGIN;
    }
}
