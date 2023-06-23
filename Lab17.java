class Lab17b {

	public static void main(String args[]) {

		System.out.println("Jivesh Lakhani 047");
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();

		animal.make_sound();
		dog.make_sound();
		cat.make_sound();
		
	}
}

class Animal {
	
	public void make_sound() {
		System.out.println("Rowwwrrrr!!");
	}
	
}

class Dog extends Animal {
	
	public void make_sound() {
		System.out.println("Woof Woof!!");
	}
}

class Cat extends Animal {
	
	public void make_sound() {
		System.out.println("Meow Meow!!");
	}
}