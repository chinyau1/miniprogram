package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-08-31 23:42
 */
@Data
@AllArgsConstructor
@Builder
public class UserInfo {
    private String avatarUrl;
    private String nickName;
}
