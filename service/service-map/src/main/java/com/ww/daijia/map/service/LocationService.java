package com.ww.daijia.map.service;

import com.ww.daijia.model.form.map.OrderServiceLocationForm;
import com.ww.daijia.model.form.map.SearchNearByDriverForm;
import com.ww.daijia.model.form.map.UpdateDriverLocationForm;
import com.ww.daijia.model.form.map.UpdateOrderLocationForm;
import com.ww.daijia.model.vo.map.NearByDriverVo;
import com.ww.daijia.model.vo.map.OrderLocationVo;
import com.ww.daijia.model.vo.map.OrderServiceLastLocationVo;

import java.math.BigDecimal;
import java.util.List;

public interface LocationService {

    //更新司机位置信息
    Boolean updateDriverLocation(UpdateDriverLocationForm updateDriverLocationForm);

    //删除司机位置信息
    Boolean removeDriverLocation(Long driverId);

    //搜索附近满足条件的司机
    List<NearByDriverVo> searchNearByDriver(SearchNearByDriverForm searchNearByDriverForm);

    Boolean updateOrderLocationToCache(UpdateOrderLocationForm updateOrderLocationForm);

    OrderLocationVo getCacheOrderLocation(Long orderId);

    Boolean saveOrderServiceLocation(List<OrderServiceLocationForm> orderLocationServiceFormList);

    OrderServiceLastLocationVo getOrderServiceLastLocation(Long orderId);

    BigDecimal calculateOrderRealDistance(Long orderId);
}
