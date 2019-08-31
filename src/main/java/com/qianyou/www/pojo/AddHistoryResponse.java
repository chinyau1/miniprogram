package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 04:20
 */
@Data
@AllArgsConstructor
@Builder
public class AddHistoryResponse {
    private List<Result> result;
}
