package com.qianyou.www.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author qianyou.huang
 * @date 2019-08-31 22:44
 */
@Data
@AllArgsConstructor
@Builder
public class GetQuestionMenuResponse {
    private List<QuestionMenu> result;
}
