package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-08-31 22:44
 */
@Data
@AllArgsConstructor
@Builder
public class ChoseList {
    private int id;
    /**
     * 选项内容
     */
    private String item;
    /**
     * 是否为正确答案
     */
    private Boolean isChose;
}