package com.company.samuczekEnum.samouczekEnum.zadanie1;

public class Human {

    public String name;
    public int age;
    public EyeColor eyeColor;
    public HairColor hairColor;

    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }


    public static void main(String[] args) {

        Human human = new Human("Karolina", 20, EyeColor.BRAUN, HairColor.BLACK);

        System.out.println(human.eyeColor);
    }

}
