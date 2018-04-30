package com.yuqiyu.book.controller;

import com.yuqiyu.book.bean.BookBean;
import com.yuqiyu.book.jpa.BookJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/18/018.
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookJPA bookJPA;

    /**
     * 查询书籍列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<BookBean> list(){
        return bookJPA.findAll();
    }
}
