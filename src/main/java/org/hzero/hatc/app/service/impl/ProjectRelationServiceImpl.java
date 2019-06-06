package org.hzero.hatc.app.service.impl;

import org.hzero.hatc.app.service.ProjectRelationService;
import org.hzero.hatc.domain.repository.ProjectRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectRelationServiceImpl implements ProjectRelationService {

    private ProjectRelationRepository projectRelationRepository;

    @Autowired

    public ProjectRelationServiceImpl(ProjectRelationRepository projectRelationRepository) {
        this.projectRelationRepository = projectRelationRepository;
    }

    @Override
    public void deleteByProjectId(Long projectId) {
        projectRelationRepository.deleteByProjectId(projectId);
    }
}
