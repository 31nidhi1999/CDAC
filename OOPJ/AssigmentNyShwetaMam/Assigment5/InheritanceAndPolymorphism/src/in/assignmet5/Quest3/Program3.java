/**3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
 * Create a subclass Dog that inherits from Animal and has an additional method bark(). 
 * Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog 
 * and calling their methods.*/

package in.assignmet5.Quest3;

class Animal{
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Seeping");
	}
	
	public void acitvity() {
		this.sleep();
		this.eat();
	    //this.bark();  //undefined
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Barking");
	}
	
	@Override
	public void acitvity() {
		// TODO Auto-generated method stub
		super.acitvity();
		this.bark();
	}
	
}

public class Program3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Dogs activity :");
		dog.acitvity();
		
		Animal a = new Animal();
		System.out.println("\n\nAnimal activity");
		a.acitvity();

	}

}
