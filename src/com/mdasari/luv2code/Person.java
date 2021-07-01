package com.mdasari.luv2code;

import java.util.StringJoiner;

public class Person {
  private int id;
  private String firstName;
  private String lastName;
  private String middleName;
  private int age;
  private boolean isMarried;

  public Person(
      int id, String firstName, String lastName, String middleName, int age, boolean isMarried) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.age = age;
    this.isMarried = isMarried;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("firstName='" + firstName + "'")
        .add("lastName='" + lastName + "'")
        .add("middleName='" + middleName + "'")
        .add("age=" + age)
        .add("isMarried=" + isMarried)
        .toString();
  }
}
