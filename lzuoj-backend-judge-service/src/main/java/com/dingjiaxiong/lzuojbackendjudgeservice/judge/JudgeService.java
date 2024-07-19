package com.dingjiaxiong.lzuojbackendjudgeservice.judge;


import com.dingjiaxiong.lzuojbackendmodel.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
