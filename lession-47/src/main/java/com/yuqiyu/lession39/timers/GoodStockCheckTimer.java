package com.yuqiyu.lession39.timers;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Created by Administrator on 2018-04-30.
 */
public class GoodStockCheckTimer extends QuartzJobBean{
    static Logger logger = LoggerFactory.getLogger(GoodStockCheckTimer.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("分布式节点quartz-cluster-node-third，执行库存检查定时任务，执行时间：{}",new Date());
    }
}
