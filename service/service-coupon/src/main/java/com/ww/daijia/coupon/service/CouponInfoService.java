package com.ww.daijia.coupon.service;

import com.ww.daijia.model.entity.coupon.CouponInfo;
import com.ww.daijia.model.form.coupon.UseCouponForm;
import com.ww.daijia.model.vo.base.PageVo;
import com.ww.daijia.model.vo.coupon.AvailableCouponVo;
import com.ww.daijia.model.vo.coupon.NoReceiveCouponVo;
import com.ww.daijia.model.vo.coupon.NoUseCouponVo;
import com.ww.daijia.model.vo.coupon.UsedCouponVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

public interface CouponInfoService extends IService<CouponInfo> {

    PageVo<NoReceiveCouponVo> findNoReceivePage(Page<CouponInfo> pageParam, Long customerId);

    PageVo<NoUseCouponVo> findNoUsePage(Page<CouponInfo> pageParam, Long customerId);

    Boolean receive(Long customerId, Long couponId);

    List<AvailableCouponVo> findAvailableCoupon(Long customerId, BigDecimal orderAmount);

    BigDecimal useCoupon(UseCouponForm useCouponForm);

    PageVo<UsedCouponVo> findUsedPage(Page<CouponInfo> pageParam, Long customerId);
}
