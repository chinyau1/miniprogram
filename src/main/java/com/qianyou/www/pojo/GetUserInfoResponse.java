package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-08-31 23:41
 */
@Data
@AllArgsConstructor
@Builder
public class GetUserInfoResponse {
    private UserInfo result;
}
