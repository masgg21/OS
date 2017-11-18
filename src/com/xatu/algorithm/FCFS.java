package com.xatu.algorithm;

import com.xatu.emity.ProcessFCFSModel;
import com.xatu.emity.ProcessModel;

/**
 * �����ȷ����㷨
 */
public class FCFS implements ProcessSchedule {
	@Override
	public int execute(ProcessModel... processList) {
		ProcessFCFSModel[] fcfsModels = (ProcessFCFSModel[]) processList;
		int runTimeSum = 0;
		for (ProcessFCFSModel model : fcfsModels) {
			if (runTimeSum < model.getComingTime()) {
				runTimeSum = (int) model.getComingTime();
			}
			// ������ҵ��ʼʱ��
			model.setStartRunTime(runTimeSum);
			runTimeSum += model.getRunTime();
			// ������ҵ���ʱ��
			model.setFinishTime(runTimeSum);
			// ������תʱ��
			model.setTurnaroundTime(runTimeSum - model.getComingTime());
			// ��Ȩ��תʱ��
			model.setTurnaroundWeightTime(1.0 * model.getTurnaroundTime() / model.getRunTime());
		}

		return runTimeSum;
	}
}
