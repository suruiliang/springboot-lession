package com.yuqiyu.jpa;

import com.yuqiyu.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/4/22/022.
 */
public interface AuthorityJPA extends JpaRepository<Authority, String> {
}
