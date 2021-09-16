package com.company;

import java.util.Objects;

public class Task7_User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Task7_User(final String firstName, final String lastName, final int age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (this.getClass() != o.getClass() || o == null)
            return false;
        final Task7_User that = (Task7_User) o;
        return age == that.age && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName)
                && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        final int result = (firstName.hashCode() + lastName.hashCode() + email.hashCode() + age);
        // return result;
        return Objects.hash(firstName, lastName, age, email);
    }

    public static void main(final String[] args) {
        final Task7_User task1 = new Task7_User("Denys", "Mars", 20, "denys@gmail.com");
        final Task7_User task = new Task7_User("Denys", "Mars", 20, "denys@gmail.com");

        if (task1.hashCode() == task.hashCode() && task1.equals(task)) {
            System.out.print("Rivno");
        } else {
            System.out.print("NE rivno");
        }
    }
}
