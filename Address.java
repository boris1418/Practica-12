package com.company;

import java.util.StringTokenizer;

public class Address {

    public Address(String data, String d) {
        String[] arr = data.split(d);
        this.country = arr[0].trim();
        this.region = arr[1].trim();
        this.city = arr[2].trim();
        this.street = arr[3].trim();
        this.house = arr[4].trim();
        this.corpus = arr[5].trim();
        this.flat = arr[6].trim();
    }

    public Address(String data) {
        StringTokenizer d = new StringTokenizer(data, ".,;");
        String[] arr = new String[7];
        int i = 0;
        while (d.hasMoreTokens()) {
            arr[i++] = d.nextToken();
        }
        this.country = arr[0].trim();
        this.region = arr[1].trim();
        this.city = arr[2].trim();
        this.street = arr[3].trim();
        this.house = arr[4].trim();
        this.corpus = arr[5].trim();
        this.flat = arr[6].trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getCorpus() {
        return corpus;
    }
    public String getFlat() {
        return flat;
    }

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;

}
