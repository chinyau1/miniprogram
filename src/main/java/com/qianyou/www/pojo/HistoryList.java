package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-09-01 19:32
 */
@Data
@AllArgsConstructor
@Builder
public class HistoryList {
    private String createdAt;
    private Integer objectId;
    private String questionMenu;
}
