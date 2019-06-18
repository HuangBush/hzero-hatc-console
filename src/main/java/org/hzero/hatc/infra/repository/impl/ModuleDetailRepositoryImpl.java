package org.hzero.hatc.infra.repository.impl;

import io.choerodon.core.exception.CommonException;
import org.hzero.hatc.domain.entity.ModuleDetail;
import org.hzero.hatc.domain.repository.ModuleDetailRepository;
import org.hzero.hatc.infra.mapper.ModuleDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ModuleDetailRepositoryImpl implements ModuleDetailRepository{
    private ModuleDetailMapper moduleDetailMapper;

    @Autowired
    public ModuleDetailRepositoryImpl(ModuleDetailMapper moduleDetailMapper) {
        this.moduleDetailMapper = moduleDetailMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ModuleDetail create(ModuleDetail moduleDetail) {
        List<ModuleDetail> moduleDetailList = moduleDetailMapper.select(moduleDetail);
        if(!moduleDetailList.isEmpty()){
            throw new CommonException("error.repo.create.moduleDetail.exist");
        }
        if(moduleDetailMapper.insertSelective(moduleDetail) != 1){
            throw new CommonException("error.repo.create.moduleDetail.failed");
        }
        return moduleDetailMapper.selectByPrimaryKey(moduleDetail.getModule_id());
    }

    @Override
    public void deleteById(Long id) {
        if (moduleDetailMapper.selectByPrimaryKey(id) == null) {
            throw new CommonException("error.moduleDetail.not.exist");
        }
        if (moduleDetailMapper.deleteByPrimaryKey(id) != 1) {
            throw new CommonException("error.moduleDetail.delete");
        }
    }

    @Override
    public ModuleDetail update(ModuleDetail moduleDetail) {
        if (moduleDetailMapper.updateByPrimaryKeySelective(moduleDetail) != 1) {
            throw new CommonException("error.moduleDetail.update");
        }
        return moduleDetailMapper.selectByPrimaryKey(moduleDetail.getModule_id());
    }

    @Override
    public ModuleDetail queryById(Long id) {
        return moduleDetailMapper.selectByPrimaryKey(id);
    };
}
