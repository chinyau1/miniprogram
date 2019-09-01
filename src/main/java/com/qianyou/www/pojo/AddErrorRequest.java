package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-09-01 10:53
 */
@Data
@AllArgsConstructor
@Builder
public class AddErrorRequest {
    /**
     * 科目id
     */
    private Integer id;
    /**
     * 科目名
     */
    private String questionMenu;

    private List<Result> err;
}
