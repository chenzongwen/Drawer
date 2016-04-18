package com.owenchan.demo;

import java.util.ArrayList;

/**
 * Created by Owen Chan on 16/4/18.
 * Copyright © 2016 Owen Chan. All rights reserved.
 */
public class Model {

    public static int ITEM_BUTTON = 0x00;
    public static int ITEM_ARROW = 0x01;

    public String ItemName;
    public int ItemType;

    public Model(String name, int type) {
        this.ItemName = name;
        this.ItemType = type;
    }

    public static ArrayList<Model> getSettingItem() {
        ArrayList<Model> items = new ArrayList<Model>();
        items.add(new Model("Test1", Model.ITEM_BUTTON));
        items.add(new Model("Test2", Model.ITEM_BUTTON));
        items.add(new Model("Test3", Model.ITEM_BUTTON));
        items.add(new Model("Test4", Model.ITEM_BUTTON));

        items.add(new Model("Test5", Model.ITEM_ARROW));
        items.add(new Model("Test6", Model.ITEM_ARROW));
        items.add(new Model("Test7", Model.ITEM_ARROW));
        items.add(new Model("Test8", Model.ITEM_ARROW));
        items.add(new Model("Test9", Model.ITEM_ARROW));
        items.add(new Model("Test10", Model.ITEM_ARROW));
        items.add(new Model("Test11", Model.ITEM_ARROW));
        items.add(new Model("Test12", Model.ITEM_ARROW));
        return items;
    }
}
