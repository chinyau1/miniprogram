package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@lombok.Data
@AllArgsConstructor
@Builder
public class Question {
    private int code;
    private Data data;
    private String message;
}