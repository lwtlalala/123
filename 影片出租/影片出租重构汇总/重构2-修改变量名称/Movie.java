
public class Movie {
public static final int CHILDRENS=2;
public static final int REGULAR=0;
public static final int NEW_RELEASE=1;
private String _title;
private int _priceCode;
public Movie(String title,int priceCode) {
	_title=title;
	_priceCode=priceCode;
}

public void setPriceCode(int arg) {
	_priceCode=arg;
}
public String getTitle() {
	return _title;
}
public int getPriceCode() {
	// TODO 自动生成的方法存根
	return _priceCode;
}
}
