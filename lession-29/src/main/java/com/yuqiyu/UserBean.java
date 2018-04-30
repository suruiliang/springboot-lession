package com.yuqiyu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018-04-22.
 */
/*@Getter
@Setter
@ToString*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    //名称
    private String name;
    //年龄
    private int age;
    //家庭住址
    private String address;

    public String getAddress() {
        return "sss" + address;
    }
}
