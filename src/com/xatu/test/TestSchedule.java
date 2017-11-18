package com.xatu.test;

import com.xatu.algorithm.FCFS;
import com.xatu.algorithm.SPF;
import com.xatu.bll.ProcessBLL;
import com.xatu.emity.ProcessFCFSModel;
import com.xatu.emity.ProcessSPFModel;
import com.xatu.tools.StringTools;

/**
 * ������
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
		System.out.println("FCFS������ʱ�䣺" + timeSum + "(ms)");
		System.out.println("���̵��ȹ��̣�\n������\t����ʱ��\t����ʱ��\t��ʼʱ��\t���ʱ��\t��תʱ��\t��Ȩ��תʱ��");
		for (ProcessFCFSModel process : processArray) {
			turnaroundSum += process.getTurnaroundTime();
			turnaroundWeightSum += process.getTurnaroundWeightTime();

			System.out.println(process.getProcessId() + "\t" + process.getComingTime() + "\t" + process.getRunTime()
					+ "\t" + process.getStartRunTime() + "\t" + process.getFinishTime() + "\t"
					+ process.getTurnaroundTime() + "\t" + StringTools.format(process.getTurnaroundWeightTime()));
		}

		System.out.println("ƽ����תʱ�䣺" + StringTools.format(turnaroundSum / processArray.length));
		System.out.println("ƽ����Ȩ��תʱ�䣺" + StringTools.format(turnaroundWeightSum / processArray.length));
	}

	private void testSPF() {
		ProcessSPFModel[] processArray = ProcessBLL.getSPFModelArray();
		SPF spf = new SPF();
		int timeSum = spf.execute(processArray);
		int turnaroundSum = 0;
		double turnaroundWeightSum = 0;
		System.out.println("SPF������ʱ�䣺" + timeSum + "(ms)");
		System.out.println("���̵��ȹ��̣�\n������\t����ʱ��\t����ʱ��\t��ʼʱ��\t���ʱ��\t��תʱ��\t��Ȩ��תʱ��");
		for (ProcessSPFModel process : processArray) {
			turnaroundSum += process.getTurnaroundTime();
			turnaroundWeightSum += process.getTurnaroundWeightTime();

			System.out.println(process.getProcessId() + "\t" + process.getComingTime() + "\t" + process.getRunTime()
					+ "\t" + process.getStartRunTime() + "\t" + process.getFinishTime() + "\t"
					+ process.getTurnaroundTime() + "\t" + StringTools.format(process.getTurnaroundWeightTime()));
		}

		System.out.println("ƽ����תʱ�䣺" + StringTools.format(turnaroundSum / processArray.length));
		System.out.println("ƽ����Ȩ��תʱ�䣺" + StringTools.format(turnaroundWeightSum / processArray.length));
	}

}