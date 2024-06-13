package com.yupi.yudada.model.dto.app;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建应用请求
 *
 */
@Data
public class AppAddRequest implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}