package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-08-31 23:35
 */
@Data
@AllArgsConstructor
@Builder
public class Result {
    /**
     * 当前选择
     */
    private List<String> choose;
    /**
     * 选择列表的信息
     */
    private List<ChoseList> choseList;
    /**
     * null未选择, 0-错误，1-正确
     */
    private Integer isOk;
    /**
     * 0-错误，1-正确
     */
    private Integer judge;
    /**
     * 题目
     */
    private String title;
    /**
     * 题目类型
     */
    private int type;
}