package ru.toofast.cat.model;

import java.io.Serializable;
import java.util.List;

public class Cat implements Serializable {

    private String name;
    private Sex sex;
    private List<String> nicknames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    @Override
    public String toString() {
        return "ru.toofast.cat.model.Cat{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", nicknames=" + nicknames +
                '}';
    }
}
