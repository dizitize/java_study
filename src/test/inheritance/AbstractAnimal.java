package test.inheritance;

public class AbstractAnimal {

	public static void animalSound(Animal animal)
	{
		animal.sound();
	}
	
	public static void main (String[]args)
	{
		Animal animal = new Dog();
		animal.breathe();
		animal.sound();
		
		animal =new Cat();
		animal.sound();
		System.out.println("====================");
		animalSound(new Cat());
		animalSound(new Dog());
	}
}

 interface SuperAbility
 {
	 public void speacialAbility();
 }


 abstract class Animal implements SuperAbility{
	
  public String kind;

	public void breathe()
	{
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
	
	
	
 }
	
 
 
	 class Dog extends Animal{
		
		 
		 public Dog() {
	        this.kind ="개시키";	
		}
		 @Override
		public void breathe() {
			// TODO Auto-generated method stub
			System.out.println(kind+" 숨을 쉽니다.");
		}
		 @Override
		public void sound() {
			// TODO Auto-generated method stub
		   System.out.println(kind+" 멍멍");	
		}
		 
		 @Override
		public void speacialAbility() {
			 System.out.println("멍멍멍 방구뿡뿡");
		}
	 }

	
	  class Cat extends Animal{
		  
		public Cat() 
		{
	        this.kind="야옹이";       
		}
		  
		  @Override
		public void sound() 
		{
			// TODO Auto-generated method stub
			System.out.println(kind+" 야옹");
		}
		
		  @Override
		public void speacialAbility() {
			// TODO Auto-generated method stub
			  System.out.println("야옹 할퀴고 캬앙!");
		}  
		  
	  }
	
