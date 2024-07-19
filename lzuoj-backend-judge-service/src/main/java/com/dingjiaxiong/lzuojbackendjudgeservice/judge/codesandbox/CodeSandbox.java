package com.dingjiaxiong.lzuojbackendjudgeservice.judge.codesandbox;


import com.dingjiaxiong.lzuojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.dingjiaxiong.lzuojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
