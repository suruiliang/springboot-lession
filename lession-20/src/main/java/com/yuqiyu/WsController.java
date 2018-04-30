package com.yuqiyu;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2018-04-22.
 */
@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyReponse say(WiselyMessage message) throws Exception {
        //等待3秒返回消息内容
        Thread.sleep(3000);
        return new WiselyReponse("欢迎使用webScoket：" + message.getName());
    }
}
