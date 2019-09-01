package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@Data
@AllArgsConstructor
@Builder
public class GetHistoryResponse {
    private HistoryResult result;
    private List<String> data;
}
