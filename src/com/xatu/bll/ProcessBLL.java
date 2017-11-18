package com.xatu.bll;

import com.xatu.emity.ProcessFCFSModel;
import com.xatu.emity.ProcessModel;
import com.xatu.emity.ProcessSPFModel;

public class ProcessBLL {

    public static ProcessFCFSModel[] getFCFSModelArray() {

        ProcessFCFSModel[] models = new ProcessFCFSModel[5];

        models[0] = new ProcessFCFSModel("A", 4, 0);
        models[1] = new ProcessFCFSModel("B", 3, 1);
        models[2] = new ProcessFCFSModel("C", 5, 2);
        models[3] = new ProcessFCFSModel("D", 2, 3);
        models[4] = new ProcessFCFSModel("E", 4, 4);

        return models;
    }

    public static ProcessSPFModel[] getSPFModelArray() {

        ProcessSPFModel[] models = new ProcessSPFModel[5];

        models[0] = new ProcessSPFModel("A", 4, 0);
        models[1] = new ProcessSPFModel("B", 3, 1);
        models[2] = new ProcessSPFModel("C", 5, 2);
        models[3] = new ProcessSPFModel("D", 2, 3);
        models[4] = new ProcessSPFModel("E", 4, 4);

        return models;
    }

    /**
     * �ж����н����Ƿ��Ѿ��������
     * @param runFlag
     *          ���̶����еĽ����������
     * @return
     *          �Ƿ�ȫ��ִ�н���
     */
    public static boolean noProcessWaitting(boolean[] runFlag) {
        for (boolean flag : runFlag) {
            if (!flag) {
                return false;
            }
        }

        return true;
    }
}
