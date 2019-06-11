package org.hzero.hatc.app.service;

import org.hzero.hatc.domain.entity.ModuleDetail;

public interface ModuleDetailService {
    ModuleDetail create(ModuleDetail moduleDetail);
    void deleteById(Long id);
    ModuleDetail update(ModuleDetail moduleDetail);
    ModuleDetail queryById(Long id);
}
