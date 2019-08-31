package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianyou.huang
 * @date 2019-08-31 22:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Menu {
    /**
     * 答题时间
     */
    private int time;
    /**
     * 总共题目数
     */
    private int questionNum;
}
