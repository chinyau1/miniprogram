package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-08-31 23:14
 */
@Data
@AllArgsConstructor
@Builder
public class Questions {
    /**
     * 1-单选题,2-多选题
     */
    private int type;
    /**
     * 题目
     */
    private String title;
    /**
     * 选项
     */
    private List<ChoseList> choseList;
}
