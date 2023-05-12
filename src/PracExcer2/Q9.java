package PracExcer2;

//Define an interface called "Animal"
interface Animal {
public void eat();
}

//Define two classes that implement the Animal interface
class Herbivore implements Animal {
public void eat() {
 System.out.println("Herbivore eats plants.");
}
}

class Carnivore implements Animal {
public void eat() {
 System.out.println("Carnivore eats meat.");
}
}

//Define a class called "Omnivore" that extends both Herbivore and Carnivore
class Omnivore extends Herbivore implements Carnivore {
// This class does not need to define an "eat()" method because it inherits it from Herbivore.
}

//Define a main class to demonstrate the use of the Animal interface and the Omnivore class
public class Q9 {
public static void main(String[] args) {
 // Create an instance of the Herbivore class and call its "eat()" method
 Herbivore herbivore = new Herbivore();
 herbivore.eat();
 
 // Create an instance of the Carnivore class and call its "eat()" method
 Carnivore carnivore = new Carnivore();
 carnivore.eat();
 
 // Create an instance of the Omnivore class and call its "eat()" method
 Omnivore omnivore = new Omnivore();
 omnivore.eat();
}
}

