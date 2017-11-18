package com.xatu.algorithm;

import com.xatu.emity.ProcessFCFSModel;
import com.xatu.emity.ProcessModel;

/**
 * 先来先服务算法
 */
public class FCFS implements ProcessSchedule {

    private static final String TAG = FCFS.class.getSimpleName();

    @Override
    public int execute(ProcessModel... processList) {
        if (processList == null || processList.length == 0) {
            System.out.println(TAG + ">数据为空");
            return -1;
        }

        if (!(processList instanceof ProcessFCFSModel[])) {
            System.out.println(TAG + ">数据类型出错");
            return -2;
        }

        ProcessFCFSModel[] fcfsModels = (ProcessFCFSModel[])processList;
        int runTimeSum = 0;
        for (ProcessFCFSModel model : fcfsModels) {
            if (runTimeSum < model.getComingTime()) {
                runTimeSum = (int)model.getComingTime();
            }
            //设置作业开始时间
            model.setStartRunTime(runTimeSum);
            runTimeSum += model.getRunTime();
            //设置作业完成时间
            model.setFinishTime(runTimeSum);
            //设置周转时间
            model.setTurnaroundTime(runTimeSum - model.getComingTime());
            //带权周转时间
            model.setTurnaroundWeightTime(1.0 * model.getTurnaroundTime() / model.getRunTime());
        }

        return runTimeSum;
    }
}

