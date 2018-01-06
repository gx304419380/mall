package com.fly.service.impl;

import com.fly.dao.ItemDao;
import com.fly.pojo.Item;
import com.fly.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    /**
     * 根据id查询item
     * @param id
     * @return
     */
    @Override
    public Item selectByPrimaryKey(Long id) {
        return itemDao.selectByPrimaryKey(id);
    }
}
