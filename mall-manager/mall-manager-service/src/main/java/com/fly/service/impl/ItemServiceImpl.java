package com.fly.service.impl;

import com.fly.dao.ItemDao;
import com.fly.pojo.Item;
import com.fly.pojo.ItemExample;
import com.fly.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 条件查询
     * @param
     * @return
     */
    @Override
    public PageInfo<Item> selectByExample() {
        ItemExample example = new ItemExample();
        //获取第 1 页， 10 条内容，默认查询总数 count
        PageHelper.startPage(1, 10);
        List<Item> items = itemDao.selectByExample(example);
        PageInfo<Item> pageInfo = new PageInfo<>(items);
        return pageInfo;
    }
}
