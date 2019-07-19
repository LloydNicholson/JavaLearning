package com.company;

public class Predator extends Animal implements CanRun {
    public Predator(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("I devoured my meat.");
    }
    
    @Override
    public void breathe() {
    
    }
    
    @Override
    public void canRun() {
        System.out.println("I ran!");
    }
    
    @Override
    public void canJump() {
        System.out.println("I jumped!");
    }
    
    @Override
    public void canKill() {
        System.out.println("I killed!");
    }
}
