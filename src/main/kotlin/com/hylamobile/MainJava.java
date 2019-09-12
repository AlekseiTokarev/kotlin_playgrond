package com.hylamobile;

import java.util.List;

public class MainJava {

    public static void main(String[] args) {

    }

    public <T> T getFirstFrom(List<T> list) {
        return list.iterator().next();
    }
}
