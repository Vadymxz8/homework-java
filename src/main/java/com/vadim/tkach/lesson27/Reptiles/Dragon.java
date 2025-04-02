package com.vadim.tkach.lesson27.Reptiles;

import com.vadim.tkach.lesson27.Reptiles.Type;

import java.util.Objects;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String color;
    private Type type;

    public Dragon(){

    }

    public Dragon(String name, int age, double weight, String color, Type type){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public Type getType(){return type; }

    public void setType(Type type){ this.type = type;}


    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dragon dragon)) return false;
        return age == dragon.age && Double.compare(weight, dragon.weight) == 0 && Objects.equals(color, dragon.color) && type == dragon.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, color, type);
    }

}

