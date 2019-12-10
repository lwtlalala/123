/*去除临时变量*/

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
private String _name;
private Vector _rentals=new Vector();
public Customer(String name) {
	_name=name;
}
public void addRental(Rental arg) {
	_rentals.addElement(arg);
}
public String getName() {
	return _name;
}
public String statement() {
	//double totalAmount=0;
	//int frequentRenterPoints=0;
	Enumeration rentals=_rentals.elements();
	String result="Rental Rencord for"+getName()+"\n";
	while(rentals.hasMoreElements()) {
		
		Rental each=(Rental) rentals.nextElement();
		
		//frequentRenterPoints+=each.getFrequentRenterPoints();
		//if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
//frequentRenterPoints++;
		result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
		//totalAmount+=each.getCharge();
	}
	result+="Amount owed is"+String.valueOf(getTotalCharge())+"\n";
	result+="You earned"+String.valueOf(getTotalFrequentRenterPoints())+"frequent renter points";
	return result;
}
private double getTotalCharge(){
	double result=0;
	Enumeration rentals=_rentals.elements();
while(rentals.hasMoreElements()) {
		
		Rental each=(Rental) rentals.nextElement();
		result+=each.getCharge();
}
return result;
}

private double getTotalFrequentRenterPoints(){
	int result=0;
	Enumeration rentals=_rentals.elements();
while(rentals.hasMoreElements()) {
		
		Rental each=(Rental) rentals.nextElement();
		result+=each.getCharge();
}
return result;
}}