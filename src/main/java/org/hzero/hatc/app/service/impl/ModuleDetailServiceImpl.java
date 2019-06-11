package org.hzero.hatc.app.service.impl;

import org.hzero.hatc.app.service.ModuleDetailService;
import org.hzero.hatc.domain.entity.ModuleDetail;
import org.hzero.hatc.domain.repository.ModuleDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ModuleDetailServiceImpl implements ModuleDetailService {

    private ModuleDetailRepository moduleDetailRepository;


    @Autowired
    public ModuleDetailServiceImpl(ModuleDetailRepository moduleDetailRepository) {
        this.moduleDetailRepository = moduleDetailRepository;
    }


    @Override
    public ModuleDetail create(ModuleDetail moduleDetail) {
        return moduleDetailRepository.create(moduleDetail);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteById(Long id) {
        moduleDetailRepository.deleteById(id);
    }

    @Override
    public ModuleDetail update(ModuleDetail moduleDetail) {
        return moduleDetailRepository.update(moduleDetail);
    }

    @Override
    public ModuleDetail queryById(Long id) {
        return moduleDetailRepository.queryById(id);
    }
}
