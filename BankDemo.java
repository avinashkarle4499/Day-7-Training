package day7;

class Bank
{
	void rateofInterest()
	{

		System.out.println("2%");

	}
	void minBalance()
	{

		System.out.println("1000rs");

	}

}
class Axis extends Bank
{
	void rateofInterest()
	{

		System.out.println("4%");

	}
}
class Icic extends Bank
{void rateofInterest()
{
	super.rateofInterest();
	System.out.println("6%");

}

}


public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank Ic= new Icic();
		Bank Ax= new Axis();
		Ic.rateofInterest();
		Ic.minBalance();

		Ax.rateofInterest();
		Ax.minBalance();
	}

}
