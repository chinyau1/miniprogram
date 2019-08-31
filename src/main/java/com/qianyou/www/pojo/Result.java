package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-08-31 23:35
 */
@Data
@AllArgsConstructor
@Builder
public class Result {
    private List<ChoseList> choseList;
    private int isOk;
    private String title;
    private int type;

    private int judge;
}