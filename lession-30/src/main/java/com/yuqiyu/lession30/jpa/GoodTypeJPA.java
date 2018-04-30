package com.yuqiyu.lession30.jpa;

import com.yuqiyu.lession30.bean.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-23.
 */
public interface GoodTypeJPA
        extends JpaRepository<GoodTypeBean, Long> {
}
