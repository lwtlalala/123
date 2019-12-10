
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Movie movie2=new Movie("media",2);
		
		Rental rental3=new Rental(movie2,10);
		Customer customer=new Customer("李希");
		customer.addRental(rental3);

		
		
		System.out.println(customer.statement());
		

	}

}
