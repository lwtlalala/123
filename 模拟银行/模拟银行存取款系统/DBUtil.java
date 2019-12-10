package 模拟银行存取款系统;

import java.util.HashMap;

public class DBUtil {
private static   DBUtil instance=null;
private HashMap<String,User>users=new HashMap<String,User>();
private DBUtil() {
	/*类似于数据库，用来存储信息*/
	
	
	User u5=new User();
	u5.setUserName("李新");
	u5.setCall("15837200005");
	u5.setCardId("555");
	u5.setCardPwd("555");
	u5.setAccount(1000);
	users.put(u5.getCardId(), u5);
	
	
	
	User u2=new User();
	u2.setUserName("李四");
	u2.setCall("15837200002");
	u2.setCardId("222");
	u2.setCardPwd("222");
	u2.setAccount(1000);
	users.put(u2.getCardId(), u2);
	User u6=new User();
	u6.setUserName("张三");
	u6.setCall("15837200006");
	u6.setCardId("666");
	u6.setCardPwd("666");
	u6.setAccount(1000);
	users.put(u6.getCardId(), u6);
	
	User u3=new User();
	u3.setUserName("李明");
	u3.setCall("15837200003");
	u3.setCardId("333");
	u3.setCardPwd("333");
	u3.setAccount(1000);
	users.put(u3.getCardId(), u3);
	
	User u4=new User();
	u4.setUserName("李华");
	u4.setCall("15837200004");
	u4.setCardId("444");
	u4.setCardPwd("444");
	u4.setAccount(1000);
	users.put(u4.getCardId(), u4);
}
public static DBUtil getlnstance() {
	if(instance==null) {
		synchronized(DBUtil.class) {
			if(instance==null) {
				instance=new DBUtil();
			}
		}
	}
	return instance;
}
public User getUser(String cardId) {
	User user=(User)users.get(cardId);
	return user;
	

	}
public HashMap<String,User>getUsers(){
	return users;
}
}
