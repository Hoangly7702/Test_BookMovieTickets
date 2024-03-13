package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ketQuaDatVePhim implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        if(delegateExecution.getVariable("receipt")==null){
            System.out.println("Rất tiếc, chúng tôi không tìm thấy vé bạn yêu cầu!\n");
        }
        else{
            System.out.println(delegateExecution.getVariable("receipt"));
            System.out.println("");
        }

    }
}
