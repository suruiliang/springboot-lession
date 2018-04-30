package com.yuqiyu.lession44.service;

import com.yuqiyu.lession44.entity.UserDetailDTO;
import com.yuqiyu.lession44.entity.UserInfoEntity;
import com.yuqiyu.lession44.jpa.UserInfoRepository;
import com.yuqiyu.lession44.mapping.anotations.ResourceMethod;
import com.yuqiyu.lession44.struct.UserMapStruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018-04-29.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserInfoService {
    /**
     * 用户数据接口
     */
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 更新用户名称查询用户详情
     * @param userName 用户名
     * @return
     */
    @ResourceMethod
    public UserDetailDTO selectByUserName(String userName) {
        /**
         * 获取用户基本信息
         */
        UserInfoEntity userInfoEntity = userInfoRepository.findUserInfoEntityByUserName(userName);
        /**
         * 通过mapStruct转换detailDto
         */
        UserDetailDTO detailDTO = UserMapStruct.INSTANCE.fromUserEntity(userInfoEntity);
        return detailDTO;
    }
}
