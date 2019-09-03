package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-09-03 02:44
 */
@Data
@AllArgsConstructor
@Builder
public class GetJsonResponse {
    private String content;
}
