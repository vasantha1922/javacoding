package methodoverriding;

class Animal {
	   public void makeSound() {
	      System.out.println("The animal makes a sound");
	   }
	}

	class Cat extends Animal {
	   public void makeSound() {
	      System.out.println("Meow");
	   }
	}

	public class Main {
	   public static void main(String[] args) {
	      Animal animal = new Animal();
	      animal.makeSound();
	      
	      Cat cat = new Cat();
	      cat.makeSound();
	   }
	}

