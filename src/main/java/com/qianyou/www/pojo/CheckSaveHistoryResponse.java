package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 03:48
 */
@Data
@AllArgsConstructor
@Builder
public class CheckSaveHistoryResponse {
    private List<Result> result;
    private HistoryItem data;
}
