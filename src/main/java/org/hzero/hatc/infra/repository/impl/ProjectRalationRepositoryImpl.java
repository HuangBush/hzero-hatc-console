package org.hzero.hatc.infra.repository.impl;

import org.hzero.hatc.domain.entity.ProjectRelation;
import org.hzero.hatc.domain.repository.ProjectRelationRepository;
import org.hzero.hatc.infra.mapper.ProjectRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectRalationRepositoryImpl implements ProjectRelationRepository {
    private ProjectRelationMapper projectRelationMapper;

    @Autowired
    public ProjectRalationRepositoryImpl(ProjectRelationMapper projectRelationMapper){
        this.projectRelationMapper = projectRelationMapper;
    }


    @Override
    public void deleteByProjectId(Long projectId) {
        ProjectRelation projectRelation = new ProjectRelation();
        projectRelation.setProjectId(projectId);
        projectRelationMapper.delete(projectRelation);
    }
}
