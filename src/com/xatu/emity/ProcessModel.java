package com.xatu.emity;

/**
 * 单个进程对象
 */
public class ProcessModel {

	String processId; // 进程标识

	long runTime; // 进程完整执行预计的时间

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public long getRunTime() {
		return runTime;
	}

	public void setRunTime(long runTime) {
		this.runTime = runTime;
	}

}
