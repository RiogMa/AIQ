package com.yupi.yudada.scoring;

import com.yupi.yudada.model.entity.App;
import com.yupi.yudada.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 */
public interface ScoringStrategy {
    /**
     *
     * @param choices 选项列表
     * @param app 应用
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}
