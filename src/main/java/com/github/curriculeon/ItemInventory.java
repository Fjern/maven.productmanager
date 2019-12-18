package com.github.curriculeon;

import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item>{
    private GenericInventory<Item> gI = new GenericInventory<>();
    @Override
    public void add(Item someObject) {
        this.gI.add(someObject);

    }

    @Override
    public Boolean contains(Item someObject) {
        return this.gI.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return this.gI.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return this.gI.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return new Item[0];
    }
}
