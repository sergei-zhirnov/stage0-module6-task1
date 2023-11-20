package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

     public String getDescription() {
        String furArticle = (hasFur == true ? "a" : "no");
        String pawQuantity = (numberOfPaws == 1 ? "paw" : "paws");
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawQuantity + " and " + furArticle + " fur.";
        return description;
    }

    public static void main(String[] args) {
        Animal cooper = new Animal("sandy", 4, true);
        cooper.getDescription();
    }
}


