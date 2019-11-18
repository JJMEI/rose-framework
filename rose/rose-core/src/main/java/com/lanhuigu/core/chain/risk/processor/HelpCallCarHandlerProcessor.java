package com.lanhuigu.core.chain.risk.processor;

import com.lanhuigu.core.chain.risk.RiskProcessorChain;
import com.lanhuigu.core.chain.risk.model.Accessory;
import com.lanhuigu.core.chain.risk.model.RiskResult;
import org.springframework.stereotype.Service;

/**
 * 代叫车风控
 *
 * @author yihonglei
 * @date 2019/10/31 5:56 PM
 */
@Service
public class HelpCallCarHandlerProcessor extends AbstractRiskProcessor {
    @Override
    public void doProcessor(Accessory accessory, RiskResult result, RiskProcessorChain chain) {
        logger.info("HelpCallCarHandlerProcessor.doProcessor");
        chain.doProcess(accessory, result);
    }
}