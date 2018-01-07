package com.fly.controller;

import com.fly.pojo.Item;
import com.fly.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("item/")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    @RequestMapping("{id}")
    @ResponseBody
    public Item findItemById(@PathVariable Long id) {
        Item item = itemService.selectByPrimaryKey(id);
        return item;
    }

}