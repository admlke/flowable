package com.hs.flowable.service;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author lk
 * Create by 2020-01-21
 **/
public interface TakeLeaveService {

    /**
     * 添加请假流程
     * @param userName
     * @param applyDataCounts
     * @return
     */
    String addTakeLeave(String userName, int applyDataCounts);

    /**
     * 添加task审批
     * @param taskId
     * @param approval
     * @return
     */
    String addTask(String taskId,String approval);

    /**
     * 生成流程图
     * @param httpServletResponse
     * @param processId
     * @throws Exception
     */
    void genProcessDiagram(HttpServletResponse httpServletResponse, String processId) throws Exception;
}
