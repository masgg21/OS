package com.xatu.test;

import com.xatu.algorithm.FCFS;
import com.xatu.algorithm.SPF;
import com.xatu.bll.ProcessBLL;
import com.xatu.emity.ProcessFCFSModel;
import com.xatu.emity.ProcessSPFModel;
import com.xatu.tools.StringTools;

/**
 * 测试类
 */
public class TestSchedule {

	public static void main(String[] args) {
		TestSchedule schedule = new TestSchedule();
		schedule.testFCFS();
		System.out.println("---------------------------------------------------------------------------------");
		schedule.testSPF();
		System.out.println("---------------------------------------------------------------------------------");
	}

	private void testFCFS() {
		FCFS fcfs = new FCFS();
		ProcessFCFSModel[] processArray = ProcessBLL.getFCFSModelArray();
		int timeSum = fcfs.execute(processArray);
		int turnaroundSum = 0;
		double turnaroundWeightSum = 0;
		System.out.println("FCFS总运行时间：" + timeSum + "(ms)");
		System.out.println("进程调度过程：\n进程名\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间\t带权周转时间");
		for (ProcessFCFSModel process : processArray) {
			turnaroundSum += process.getTurnaroundTime();
			turnaroundWeightSum += process.getTurnaroundWeightTime();

			System.out.println(process.getProcessId() + "\t" + process.getComingTime() + "\t" + process.getRunTime()
					+ "\t" + process.getStartRunTime() + "\t" + process.getFinishTime() + "\t"
					+ process.getTurnaroundTime() + "\t" + StringTools.format(process.getTurnaroundWeightTime()));
		}

		System.out.println("平均周转时间：" + StringTools.format(turnaroundSum / processArray.length));
		System.out.println("平均带权周转时间：" + StringTools.format(turnaroundWeightSum / processArray.length));
	}

	private void testSPF() {
		ProcessSPFModel[] processArray = ProcessBLL.getSPFModelArray();
		SPF spf = new SPF();
		int timeSum = spf.execute(processArray);
		int turnaroundSum = 0;
		double turnaroundWeightSum = 0;
		System.out.println("SPF总运行时间：" + timeSum + "(ms)");
		System.out.println("进程调度过程：\n进程名\t到达时间\t服务时间\t开始时间\t完成时间\t周转时间\t带权周转时间");
		for (ProcessSPFModel process : processArray) {
			turnaroundSum += process.getTurnaroundTime();
			turnaroundWeightSum += process.getTurnaroundWeightTime();

			System.out.println(process.getProcessId() + "\t" + process.getComingTime() + "\t" + process.getRunTime()
					+ "\t" + process.getStartRunTime() + "\t" + process.getFinishTime() + "\t"
					+ process.getTurnaroundTime() + "\t" + StringTools.format(process.getTurnaroundWeightTime()));
		}

		System.out.println("平均周转时间：" + StringTools.format(turnaroundSum / processArray.length));
		System.out.println("平均带权周转时间：" + StringTools.format(turnaroundWeightSum / processArray.length));
	}

}