package com.yuqiyu.lession30.jpa;

import com.yuqiyu.lession30.bean.GoodInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface GoodInfoJPA
        extends JpaRepository<GoodInfoBean, Long> {

}
