package com.learn.springboot.learnspringboot;

public class SingletonClass {
    // Step 2: Private static instance
    private static SingletonClass instance;

    // Step 1: Private constructor
    private SingletonClass() {
        // Prevent instantiation
    }

    // Step 3: Public static method to get the instance
    public static SingletonClass getInstance() {
        if (instance == null) {
            // If the instance doesn't exist, create a new one
            instance = new SingletonClass();
        }
        // Return the instance (either existing or newly created)
        return instance;
    }

    // Other methods of the class
    public void doSomething() {
        System.out.println("Singleton class is doing something.");
    }
}

