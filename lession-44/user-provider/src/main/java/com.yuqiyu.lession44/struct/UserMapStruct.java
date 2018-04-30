package com.yuqiyu.lession44.struct;

import com.yuqiyu.lession44.entity.UserDetailDTO;
import com.yuqiyu.lession44.entity.UserInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by Administrator on 2018-04-29.
 */
@Mapper
public interface UserMapStruct {
    /**
     * get new instance
     */
    public static UserMapStruct INSTANCE = Mappers.getMapper(UserMapStruct.class);

    /**
     * 从用户基本实体转换userDetailDto实例
     *
     * @param user 用户基本实体
     * @return
     */
    @Mapping(source = "user.userId", target = "userId")
    public UserDetailDTO fromUserEntity(UserInfoEntity user);
}
