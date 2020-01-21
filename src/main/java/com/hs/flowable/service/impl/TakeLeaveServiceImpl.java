package com.hs.flowable.service.impl;

import com.hs.flowable.service.TakeLeaveService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author lk
 * Create by 2020-01-21
 **/
@Service
public class TakeLeaveServiceImpl implements TakeLeaveService {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RepositoryService repositoryService;
    @Qualifier("processEngine")
    @Autowired
    private ProcessEngine processEngine;

    @Override
    public String addTakeLeave(String userName, int applyDataCounts) {
        return null;
    }

    @Override
    public String addTask(String taskId, String approval) {
        return null;
    }

    @Override
    public void genProcessDiagram(HttpServletResponse httpServletResponse, String processId) throws Exception {

    }
}
