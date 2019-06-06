package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.Project;
import org.hzero.hatc.domain.repository.ProjectRepository;
import org.hzero.hatc.infra.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProjectRepositoryImpl implements ProjectRepository {
    private ProjectMapper projectMapper;

    @Autowired
    public ProjectRepositoryImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Project create(Project project){
        List<Project> projectList = projectMapper.select(project);
        if (!projectList.isEmpty()){
            throw new CommonException("error.repo.create.project.exist");
        }
        if (projectMapper.insertSelective(project) != 1) {
            throw new CommonException("error.repo.create.project.failed");
        }
        return projectMapper.selectByPrimaryKey(project.getProjectId());
    }

    @Override
    public void deleteById(Long id){
        if (projectMapper.selectByPrimaryKey(id) == null) {
            throw new CommonException("error.project.not.exist");
        }
        if (projectMapper.deleteByPrimaryKey(id) != 1) {
            throw new CommonException("error.project.delete");
        }
    }

    @Override
    public Project update(Project project){
        if (projectMapper.updateByPrimaryKeySelective(project) != 1) {
            throw new CommonException("error.project.update");
        }
        return projectMapper.selectByPrimaryKey(project.getProjectId());
    }

    @Override
    public Project queryById(Long id){
        return projectMapper.selectByPrimaryKey(id);
    }

}
