/**
 * Copyright 2019 bejson.com
 */
package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@lombok.Data
@AllArgsConstructor
@Builder
public class Data {
    private List<Question_list> question_list;
    private List<String> question_ids;
}