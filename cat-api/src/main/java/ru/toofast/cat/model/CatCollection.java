package ru.toofast.cat.model;

import java.io.Serializable;
import java.util.Collection;

public class CatCollection implements Serializable {

    private Collection<Cat> cats;


    public Collection<Cat> getCats() {
        return cats;
    }

    public void setCats(Collection<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "ru.toofast.cat.model.CatCollection{" +
                "cats=" + cats +
                '}';
    }
}
