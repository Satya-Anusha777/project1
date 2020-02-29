package day.seven;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer customer1 = new Customer(100,"SACHIN","TENDULKAR",6666.66,"9898897888");
		System.out.println(customer1); //toString() is called..
		customer1.setLastName("RAMESH TENDULKAR"); //setter is used for changing value
		System.out.println(customer1); 
		Customer customer2 = new Customer(101,"VIRAT","KOHLI",7777.77,"78787878000");
		System.out.println(customer2);
		customer2.setBalance(customer2.getBalance() + 1000); //getter used for retrieving value
		System.out.println("Current Balance is : " + customer2.getBalance());
	}
}