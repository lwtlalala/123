
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Movie movie2=new Movie("ϲ��Ƭ",2);
		
		Rental rental3=new Rental(movie2,365);
		Customer customer=new Customer("���");
		customer.addRental(rental3);

		
		
		System.out.println(customer.statement());
		

	}

}
