package com.hainiuxy.Generic3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Fu> listFu = new ArrayList<>();
        listFu.add(new Fu());
        listFu.add(new Fu());

        ArrayList<Zi> listZi = new ArrayList<>();
        listZi.add(new Zi());
        listZi.add(new Zi());

        listFu.addAll(listZi); // 多态

        System.out.print(listFu);
    }
}
