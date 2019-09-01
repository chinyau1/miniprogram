package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@Data
@AllArgsConstructor
@Builder
public class GetHistoryRequest {
    private Integer id;
}
