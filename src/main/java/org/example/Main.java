package org.example;


public class Main {
    public static void addUser() throws IllegalAccessException {
        User user = new User("Kirill", 15);
        try {
            System.out.println(user);
        } catch (IllegalArgumentException | LowAgeException exception) {
            if (exception instanceof IllegalArgumentException) {
                System.out.println(exception);
            } else {
                System.out.println(exception);
            }
        }finally {
            System.out.println("Пользователь создан");
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        addUser();

    }
}