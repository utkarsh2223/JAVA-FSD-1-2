package PracExcer2;

//Define a class called "Person"
class Person {
// Define instance variables
private String name;
private int age;

// Define a constructor
public Person(String name, int age) {
 this.name = name;
 this.age = age;
}

// Define getter and setter methods for the name variable
public String getName() {
 return name;
}

public void setName(String name) {
 this.name = name;
}

// Define getter and setter methods for the age variable
public int getAge() {
 return age;
}

public void setAge(int age) {
 this.age = age;
}

// Define a method to print the person's information
public void printInfo() {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
}
}

//Define a main class to create and use instances of the Person class
public class Q8 {
public static void main(String[] args) {
 // Create two instances of the Person class
 Person person1 = new Person("Alice", 25);
 Person person2 = new Person("Bob", 30);
 
 // Use the getter and setter methods to modify the person1 object
 person1.setName("Carol");
 person1.setAge(35);
 
 // Call the printInfo() method for each person object
 person1.printInfo();
 person2.printInfo();
 
}
}

