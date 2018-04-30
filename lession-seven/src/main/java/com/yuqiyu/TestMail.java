package com.yuqiyu;

import com.yuqiyu.core.MailSender;
import com.yuqiyu.enums.MailContentTypeEnum;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public class TestMail {
    public static void main(String[] args) throws Exception {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送by spring boot start mail")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>() {{
                    add("395020773@qq.com");
                }})
                .send();
    }
}
