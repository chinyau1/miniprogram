package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-08-31 22:44
 */
@Data
@AllArgsConstructor
@Builder
public class GetMenuByIdResponse {
    private Menu result;
}
