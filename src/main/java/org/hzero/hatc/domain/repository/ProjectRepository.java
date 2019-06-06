package org.hzero.hatc.domain.repository;

import org.hzero.hatc.domain.entity.Project;

public interface ProjectRepository {
    Project create(Project project);

    void deleteById(Long id);

    Project update(Project project);

    Project queryById(Long id);
}
