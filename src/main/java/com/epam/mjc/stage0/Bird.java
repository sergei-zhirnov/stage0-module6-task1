package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }
    @Override
    public String getDescription() {
        String birdDescription = super.getDescription() + " Moreover, it has 2 wings and can fly.";
        System.out.println(birdDescription);
        return birdDescription;
    }

    public static void main(String[] args) {
        Bird tweety = new Bird();
        tweety.getDescription();
    }
}
