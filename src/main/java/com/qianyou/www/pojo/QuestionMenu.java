package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author qianyou.huang
 * @date 2019-08-31 22:45
 */
@Data
@AllArgsConstructor
@Builder
public class QuestionMenu {
    private String name;
    private int objectId;
    private Menu menu;
}
