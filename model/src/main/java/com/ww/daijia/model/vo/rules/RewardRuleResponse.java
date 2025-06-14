package com.ww.daijia.model.vo.rules;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RewardRuleResponse {


    @Schema(description = "奖励金额")
    private BigDecimal rewardAmount;

}
