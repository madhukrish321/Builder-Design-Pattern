package com.mdasari.luv2code;

public class PersonBuilder {
  private int id;
  private String firstName;
  private String lastName;
  private String middleName;
  private int age;
  private boolean isMarried;

  public PersonBuilder setId(int id) {
    this.id = id;
    return this;
  }

  public PersonBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public PersonBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public PersonBuilder setMiddleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  public PersonBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public PersonBuilder setMarried(boolean married) {
    isMarried = married;
    return this;
  }

  public Person getPerson() {
    Person person = new Person(id, firstName, lastName, middleName, age, isMarried);
    return person;
  }
}
