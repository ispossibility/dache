package com.ww.daijia.map.client;

import com.ww.daijia.common.result.Result;
import com.ww.daijia.model.form.map.CalculateDrivingLineForm;
import com.ww.daijia.model.vo.map.DrivingLineVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "service-map")
public interface MapFeignClient {

    /**
     * 计算驾驶线路
     * @param calculateDrivingLineForm
     * @return
     */
    @PostMapping("/map/calculateDrivingLine")
    Result<DrivingLineVo> calculateDrivingLine(@RequestBody CalculateDrivingLineForm calculateDrivingLineForm);
}