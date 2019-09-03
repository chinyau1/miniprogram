/**
 * Copyright 2019 bejson.com
 */
package com.qianyou.www.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianyou.huang
 * @date 2019-09-01 11:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionOptions {
    @JSONField(name = "A")
    private String optiona;
    @JSONField(name = "B")
    private String optionb;
    @JSONField(name = "C")
    private String optionc;
    @JSONField(name = "D")
    private String optiond;
}