public class Animal 	
{
	public void eat() {
		System.out.println("animal eat");
	}

	
	public static void main(String[] args) 
	{
		Animal a = new Animal() ;
		a.eat();
		Dog dog = new Dog();
		dog.eatTest();
	}

}


class Dog extends Animal{
	
	public void eat() 
		{
			System.out.println("dog eat  ");
		}

	public void eatTest() 
		{
			this.eat();
			super.eat();
		}
	
	class Cat
		{
			public Cat() 
				{
					eatTest();
				}
		}
}
