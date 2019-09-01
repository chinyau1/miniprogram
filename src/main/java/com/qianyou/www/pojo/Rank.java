package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-09-01 14:41
 */
@Data
@AllArgsConstructor
@Builder
public class Rank {
    private User user;
    private Integer score;

}
