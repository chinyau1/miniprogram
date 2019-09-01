package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-09-01 13:37
 */
@Data
@AllArgsConstructor
@Builder
public class Average {
    private Integer allScore;
    private Integer peopleNum;
}
