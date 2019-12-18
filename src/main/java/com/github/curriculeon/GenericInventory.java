package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>,Iterable<SomeType> {
    private List<SomeType> Al = new ArrayList<>();
    @Override
    public void add(SomeType someObject) {
        this.Al.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return this.Al.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.Al.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return this.Al.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return objectsToBeAdded;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return this.Al.iterator();
    }
}
