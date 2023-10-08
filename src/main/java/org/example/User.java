package org.example;

public class User {
    private String name;
    private int age;

    public User(String name, int age) throws IllegalAccessException{
        if (name == null) {
            throw new IllegalAccessException("Имя не может быть пустым");
        }
        this.name = name;
        if (age < 7) {
            throw new LowAgeException("Ты слишком молод  для интернета");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + this.name
                + " Age = " + this.age;
    }
}
