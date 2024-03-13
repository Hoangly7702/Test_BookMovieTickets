package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class guiYeuCauDatVe implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Yêu cầu đặt vé xem phim của bạn đang được xử lý, vui lòng chờ trong giây lát!\n");
    }
}
