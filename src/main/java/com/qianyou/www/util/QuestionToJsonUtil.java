package com.qianyou.www.util;

import com.alibaba.fastjson.JSON;
import com.qianyou.www.pojo.Data;
import com.qianyou.www.pojo.Question;
import com.qianyou.www.pojo.QuestionOptions;
import com.qianyou.www.pojo.Question_list;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 导入题库
 */
public class QuestionToJsonUtil {

    public static String getJson(String content) {
        content = content.replaceAll("\\n+", "\n");
        String[] answer = content.split("答案[\\s\\S]*?\\n");

        List<String> realAnswer = new ArrayList<>();
        Pattern pt = Pattern.compile("(?<=答案：).*?(?=(&|\\n))");
        Matcher mt = pt.matcher(content);
        //真实答案
        while (mt.find()) {
            realAnswer.add(mt.group());
        }

        List<Question_list> question_list = new ArrayList<>();
        List<String> question_ids = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            try {
                Question_list toptic = new Question_list();

                String s = answer[i];
                String[] split = s.split("\\n");

                QuestionOptions options = new QuestionOptions();
                for (int j = 0; j < split.length; j++) {
                    String s1 = split[j];
                    if (0 == j) {
                        int indexOf = s1.indexOf("、");
                        s1 = s1.substring(indexOf + 1);
                        //题目
                        toptic.setQuestion(s1);
                    } else {
                        int indexOf = s1.indexOf(".");
                        String substring = s1.substring(0, indexOf);
                        s1 = s1.substring(indexOf + 1);
                        switch (substring) {
                            case "A":
                                options.setOptiona(s1);
                                break;
                            case "B":
                                options.setOptionb(s1);
                                break;
                            case "C":
                                options.setOptionc(s1);
                                break;
                            case "D":
                                options.setOptiond(s1);
                                break;
                            default:
                                break;
                        }
                    }
                }

                //选项
                toptic.setOptions(options);
                //答案
                toptic.setAnswer(realAnswer.get(i));
                toptic.setCategory("0");
                toptic.setChapter_id("1");
                toptic.setComments("暂时无解释内容");
                toptic.setCourse("1");
                toptic.setDifficulty("2");
                toptic.setMedia("");
                toptic.setMedia_type("0");
                toptic.setQuestion_id("" + (i + 1));
                question_ids.add("" + (i + 1));
                toptic.setType("1");
                toptic.setType_name("单选");
                question_list.add(toptic);
            } catch (Exception e) {
                System.out.println("发生异常：" + i);
                continue;
            }
        }

        Question build = Question.builder()
                .code(1)
                .data(Data.builder()
                        .question_ids(question_ids)
                        .question_list(question_list)
                        .build())
                .message("")
                .build();

        return JSON.toJSON(build).toString();
    }
}
