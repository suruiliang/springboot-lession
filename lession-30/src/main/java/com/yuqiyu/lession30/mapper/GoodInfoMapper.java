package com.yuqiyu.lession30.mapper;

import com.yuqiyu.lession30.bean.GoodInfoBean;
import com.yuqiyu.lession30.bean.GoodTypeBean;
import com.yuqiyu.lession30.dto.GoodInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by Administrator on 2018-04-23.
 */
@Mapper(componentModel = "spring")
//@Mapper
public interface GoodInfoMapper {
    //public static GoodInfoMapper MAPPER = Mappers.getMapper(GoodInfoMapper.class);

    @Mappings({
            @Mapping(source = "type.name", target = "typeName"),
            @Mapping(source = "good.id", target = "goodId"),
            @Mapping(source = "good.title", target = "goodName"),
            @Mapping(source = "good.price", target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);
}
