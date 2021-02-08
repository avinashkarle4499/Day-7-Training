package day7;

class Employee 
{
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;

	}


	void dispalyEmployeeInfo()
	{
		System.out.println("id" + id);
		System.out.println("name" + name);
		System.out.println("doorno" + address.doorno);
		System.out.println("street name" + address.streetname);
		System.out.println("city" + address.city);
	}	
}
class Address
{
	int doorno;
	String streetname;
	String city;
	public Address(int doorno, String streetname, String city) {
		super();
		this.doorno = doorno;
		this.streetname = streetname;
		this.city = city;
	}


}



public class HasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address ad = new Address (234, "Btm", "Bangalore");
		Employee emp = new Employee(1,"rahul",ad);
		emp.dispalyEmployeeInfo();
	}

}

