package org.hzero.hatc.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@ModifyAudit
@VersionAudit
@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * 中间表
 * @author jiayanyan 2019/06/05
 */
public class TaskProject extends AuditDomain {
    @Id
    @GeneratedValue
    private Long id;
    private Task task;
    private Project project;

    public TaskProject() {
    }

    public TaskProject(Task task, Project project) {
        this.task = task;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "TaskProject{" +
                "id=" + id +
                ", task=" + task +
                ", project=" + project +
                '}';
    }
}
