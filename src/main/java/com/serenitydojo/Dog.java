package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;

    static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = false;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public void feed() {
        isFed = true;
    }

    public boolean isFed() {
        return isFed;
    }
}
