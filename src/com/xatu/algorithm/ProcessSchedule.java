package com.xatu.algorithm;

import com.xatu.emity.ProcessModel;

/**
 * 进程调度接口
 * @author Administrator
 * 
 */
public interface ProcessSchedule {
	int execute(ProcessModel ... processList);
}
