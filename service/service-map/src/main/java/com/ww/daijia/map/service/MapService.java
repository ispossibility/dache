package com.ww.daijia.map.service;

import com.ww.daijia.model.form.map.CalculateDrivingLineForm;
import com.ww.daijia.model.vo.map.DrivingLineVo;

public interface MapService {

    //计算驾驶线路
    DrivingLineVo calculateDrivingLine(CalculateDrivingLineForm calculateDrivingLineForm);
}
