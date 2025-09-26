//question 01:
----------------------------

import java.util.*;
import java.util.stream.*;
public class Main{
  public static void main(String[] args){
    List<Employee> emps = Arrays.asList(
      new Employee("Avinash",30),
      new Employee("Abhishek",31),
      new Employee("Sikender",28),
      new Employee("Prakhar",29),
      new Employee("Manas",26),
      new Employee("Chetan",26));

    //Find all the employee whose age is greater than 28
    List<Employee> empL1 = emps.stream().filter(e -> e.age > 28).collect(Collectors.toList());
    System.out.println(empL1);
  }
}

class Employee{
  String name;
  Integer age;

  Employee(String name, Integer age){
    this.name = name;
    this.age = age;
  }
}
