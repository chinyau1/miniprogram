package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 10:26
 */
@Data
@AllArgsConstructor
@Builder
public class GetErrorResponse {
    private List<Error> error;
    private boolean result;
}
