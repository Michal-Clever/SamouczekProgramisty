package com.company.samuczekEnum.samouczekEnum;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }


    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.XXL, "Polo");
        System.out.println(tshirt.manufacturer);


    }
}
