package com.mhodges.demo2;

public class Doggo implements Comparable<Doggo> {
    private String name;
    private String breed;
    private int age;
    private float height;
    private float weight;

    public Doggo (String name, String breed, int age, float height, float weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Doggo doggo) {
        return Float.compare(getWeight(), doggo.getWeight());
    }
}
