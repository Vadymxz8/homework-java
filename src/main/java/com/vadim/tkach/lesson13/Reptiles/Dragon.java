package com.vadim.tkach.Reptiles;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String color;

    public Dragon(){
        System.out.println("Dragon Constructor called");
    }


    public Dragon(String name, int age, double weight, String color){
        System.out.println("Dragon Constructor WITH PARAMETERS called");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void doVoice(){
        System.out.println("RRRAAAAARRRRRR!");
    }

    public void doVoice(String text){
        System.out.println(text + "RRRAAAAARRRRRR!");
    }

    public void doFire(){
        System.out.println("\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
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

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
