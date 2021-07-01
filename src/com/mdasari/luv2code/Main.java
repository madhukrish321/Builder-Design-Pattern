package com.mdasari.luv2code;

/*
 * If we observe below code we have created person object in two ways.
 *
 * person1 -> Here we have created using Person Constructor
 *
 * person2 -> Here we have created using PersonBuilder class.
 * (This has more flexibility. Because sometimes we don't want to pass all parameters while creating the Person object)
 * (For example some persons doesn't have a middle name)
 */
public class Main {
  public static void main(String[] args) {
    Person person1 = new Person(1, "Madhu", "Dasari", "Krishna", 35, true);
    System.out.println(person1);
    /*
     * Output:
     * Person[id=1, firstName='Madhu', lastName='Dasari', middleName='Krishna', age=35, isMarried=true]
     */

    PersonBuilder personBuilder = new PersonBuilder();
    personBuilder.setId(21).setFirstName("Lakshmi").setLastName("Chalasani");
    Person person2 = personBuilder.getPerson();
    System.out.println(person2);
    /*
     * Output:
     * Person[id=21, firstName='Lakshmi', lastName='Chalasani', middleName='null', age=0, isMarried=false]
     */
  }
}
