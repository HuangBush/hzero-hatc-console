package org.hzero.hatc.api.controller.v1;


import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.util.Results;
import org.hzero.hatc.app.service.ModuleDetailService;
import org.hzero.hatc.domain.entity.ModuleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author wu
 */
@RestController
@RequestMapping(value = "v1/moduleDetail")
public class ModuleDetailController {
    private ModuleDetailService moduleDetailService;

    @Autowired
    public ModuleDetailController(ModuleDetailService moduleDetailService) {
        this.moduleDetailService = moduleDetailService;
    }

    @PostMapping()
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "创建moduleDetail")
    public ResponseEntity<ModuleDetail> create(@RequestBody ModuleDetail moduleDetail) {
        moduleDetail.setCREATION_DATE(new Date());
        return Results.success(moduleDetailService.create(moduleDetail));
    }

    @DeleteMapping("/delete/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "根据id删除moduleDetail")
    public void delete(@PathVariable Long id) {
        moduleDetailService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "更新moduleDetail")
    public ResponseEntity<ModuleDetail> update(@PathVariable Long id, @RequestBody ModuleDetail moduleDetail) {
        moduleDetail.setModule_id(id);
        return Results.success(moduleDetailService.update(moduleDetail));
    }

}
