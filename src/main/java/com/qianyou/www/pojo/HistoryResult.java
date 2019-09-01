package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoryResult {
    private Integer menu;
    private Integer score;
    private List<Result> questionList;
}
