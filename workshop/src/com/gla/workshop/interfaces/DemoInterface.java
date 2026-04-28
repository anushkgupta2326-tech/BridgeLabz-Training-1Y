package com.gla.workshop.interfaces;

public interface DemoInterface {
    default void display() {
        show();
        System.out.println("Default method");
    }

    private void show() {
        System.out.println("Private method");
    }
}
