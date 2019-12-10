
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Movie movie2=new Movie("喜剧片",2);
		
		Rental rental3=new Rental(movie2,365);
		Customer customer=new Customer("李红");
		customer.addRental(rental3);

		
		
		System.out.println(customer.statement());
		

	}

}
