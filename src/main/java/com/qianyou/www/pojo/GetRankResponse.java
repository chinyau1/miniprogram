package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 14:38
 */
@Data
@AllArgsConstructor
@Builder
public class GetRankResponse {
    private boolean result;
    private List<Rank> data;
}
