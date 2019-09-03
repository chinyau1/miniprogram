/**
 * Copyright 2019 bejson.com
 */
package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question_list {
    private String question_id;
    /**
     * 题目
     */
    private String question;

    /**
     * 解释
     */
    private String comments;
    private String type;
    private String type_name;

    /**
     * 答案
     */
    private String answer;

    /**
     * 选项
     */
    private QuestionOptions options;
    private String media;
    private String media_type;
    private String category;
    private String chapter_id;
    private String course;
    private String difficulty;
}