package com.company;

import java.util.Vector;

public class TestClass {
    Vector<Address> v;
    public TestClass() {
        v = new Vector<>();
    }

    public void addComma(String s) {
        v.add(new Address(s, ","));
    }

    public void addAllDelimiters(String s) {
        v.add(new Address(s));
    }

    public void printAll() {
        int i = 1;
        for (Address a : v) {
            System.out.println("Address " + i + ":");
            System.out.println("Country: " + a.getCountry());
            System.out.println("Region: " + a.getRegion());
            System.out.println("City: " + a.getCity());
            System.out.println("Street: " + a.getStreet());
            System.out.println("House: " + a.getHouse());
            System.out.println("Corpus: " + a.getCorpus());
            System.out.println("Flat: " + a.getFlat());
            System.out.println();
            ++i;
        }
    }

}
