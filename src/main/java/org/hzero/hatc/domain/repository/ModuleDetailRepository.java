package org.hzero.hatc.domain.repository;

import org.hzero.hatc.domain.entity.ModuleDetail;

public interface ModuleDetailRepository {
    ModuleDetail create(ModuleDetail moduleDetail);
    void deleteById(Long id);
    ModuleDetail update(ModuleDetail moduleDetail);
    ModuleDetail queryById(Long id);
}
