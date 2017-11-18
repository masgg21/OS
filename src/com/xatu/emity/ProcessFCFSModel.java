package com.xatu.emity;

/**
 * ģ��FCFS�Ľ��̶���
 */
public class ProcessFCFSModel extends ProcessModel {

    private long comingTime; // ����ʱ��
    private long startRunTime; // ��ʼִ��ʱ��
    private long finishTime; // ���ʱ��
    private long turnaroundTime; // ��תʱ��
    private double turnaroundWeightTime; // ��Ȩ��תʱ��

    public ProcessFCFSModel(String processId, long runTime, long comingTime) {
        this.processId = processId;
        this.runTime = runTime;
        this.comingTime = comingTime;
    }

    public long getComingTime() {
        return comingTime;
    }

    public void setComingTime(long comingTime) {
        this.comingTime = comingTime;
    }

    public long getStartRunTime() {
        return startRunTime;
    }

    public void setStartRunTime(long startRunTime) {
        this.startRunTime = startRunTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public long getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(long turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public double getTurnaroundWeightTime() {
        return turnaroundWeightTime;
    }

    public void setTurnaroundWeightTime(double turnaroundWeightTime) {
        this.turnaroundWeightTime = turnaroundWeightTime;
    }
}
