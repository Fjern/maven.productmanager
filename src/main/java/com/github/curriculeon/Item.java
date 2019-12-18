package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Item {
    private String name;
    public Item(String itemName) {
        this.setName(itemName);
    }

    private void setName(String itemName) {
        this.name=itemName;
    }

    public String getName() {
        return this.name;
    }
}
