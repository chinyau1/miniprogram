package com.qianyou.www.pojo;

/**
 * @author qianyou.huang
 * @date 2019-09-03 01:45
 */

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
public class GetJsonRequest {
    private String filePath;
}
