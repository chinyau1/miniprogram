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
public class AddHistoryRequest {
    /**
     * 科目id
     */
    private Integer menu;

    /**
     * 分数
     */
    private int score;
    private List<Result> result;

    /**
     * 科目名称
     */
    private String questionMenu;
    /**
     * 保存状态0-保存，1-交卷
     */
    private int saveStatus;
    private int seconds;
    private String minutes;
}