package org.hzero.hatc.app.service;

import org.hzero.hatc.domain.entity.Project;

public interface ProjectService {
    Project create(Project project);

    void deleteById(Long id);

    Project update(Project project);

    Project queryById(Long id);
}
