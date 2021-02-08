package day7;

class Parent 
{

	void property()
	{

		System.out.println("20 laks");
	}
	void marry()
	{
		System.out.println("you marry preeti");

	}
}
class Child extends Parent
{


	void marry()
	{
		System.out.println("i will marry kareena");

	}
}



public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.property();
		c.marry();

		Parent p = new Child();
		p.property();
		p.marry();
		
	}

}

