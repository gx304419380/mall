package com.fly.service;

import com.fly.pojo.Item;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    Item selectByPrimaryKey(Long id);
    PageInfo<Item> selectByExample();
}
