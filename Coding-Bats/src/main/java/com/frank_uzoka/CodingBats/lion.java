package com.frank_uzoka.CodingBats;

public class lion {

    private String name;
    private int age;
    private int weight;


    public lion(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void roar() {
        System.out.println("ROAR");
    }
    public void pounce() {
        System.out.println("POUNCING");
    }
    public void nap() {
        System.out.println("ZzzZzzZzz");
    }


}
