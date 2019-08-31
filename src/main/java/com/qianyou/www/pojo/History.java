package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 03:54
 */
@Data
@AllArgsConstructor
@Builder
public class History {
    /**
     * 0-错误，1-正确
     */
    private int judge;

    private List<ChoseList> choseList;

    private int type;
}
