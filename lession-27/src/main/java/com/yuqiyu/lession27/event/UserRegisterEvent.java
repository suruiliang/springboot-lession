package com.yuqiyu.lession27.event;

import com.yuqiyu.lession27.bean.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2018-04-22.
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent {
    //注册用户对象
    private UserBean user;

    /**
     * 重写构造函数
     *
     * @param source 发生事件的对象
     * @param user   注册用户对象
     */
    public UserRegisterEvent(Object source, UserBean user) {
        super(source);
        this.user = user;
    }
}
