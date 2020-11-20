package com.company;

import java.util.StringTokenizer;

public class Shirt {

    public Shirt(String data, String d) {
        String[] arr = data.split(d);


    }

    public Shirt(String data) {
        StringTokenizer d = new StringTokenizer(data, ".,;");
        String[] arr = new String[4];
        int i = 0;
        while (d.hasMoreTokens()) {
            arr[i++] = d.nextToken();
        }
        this.model = arr[0].trim();
        this.name = arr[1].trim();
        this.color = arr[2].trim();
        this.size = arr[3].trim();
    }

    @Override
    public String toString() {
        return "Shirt{\n" +
                "  model = '" + model + ",\n" +
                "  name = '" + name + ",\n" +
                "  color = '" + color + ",\n" +
                "  size = '" + size + ",\n" +
                '}';
    }

    private String model;
    private String name;
    private String color;
    private String size;

}
