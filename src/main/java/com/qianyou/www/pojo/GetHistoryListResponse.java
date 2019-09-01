package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:45
 */
@Data
@AllArgsConstructor
@Builder
public class GetHistoryListResponse {
    private Integer result;
    private List<String> data;

}
