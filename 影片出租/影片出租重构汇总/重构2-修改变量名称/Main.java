
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Movie movie2=new Movie("media",2);
		
		Rental rental3=new Rental(movie2,10);
		Customer customer=new Customer("��ϣ");
		customer.addRental(rental3);

		
		
		System.out.println(customer.statement());
		

	}

}
