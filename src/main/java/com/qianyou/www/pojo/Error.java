package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 10:38
 */
@Data
@AllArgsConstructor
@Builder
public class Error {
    /**
     * 科目id
     */
    private Integer objectId;
    private List<Result> questionList;
}
