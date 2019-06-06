package org.hzero.hatc.app.service.impl;

import org.hzero.hatc.app.service.ProjectService;
import org.hzero.hatc.domain.entity.Project;
import org.hzero.hatc.domain.repository.ProjectRepository;
import org.hzero.hatc.domain.repository.ProjectRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;
    private ProjectRelationRepository projectRelationRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectRelationRepository projectRelationRepository) {
        this.projectRepository = projectRepository;
        this.projectRelationRepository = projectRelationRepository;
    }



    @Override
    public Project create(Project project) {
        return projectRepository.create(project);
    }

    /**
     * 删除project表信息、级联删除project_relation表信息
     * @param id
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
        projectRelationRepository.deleteByProjectId(id);
    }

    @Override
    public Project update(Project project) {
        return projectRepository.update(project);
    }

    @Override
    public Project queryById(Long id) {
        return projectRepository.queryById(id);
    }
}
