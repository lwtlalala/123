
public class TelcomAccountSystem {

	public static void main(String[] args) {
		//ʵ����һ�������û���TelcomUser
		TelcomUserBasedOnCollection telcomUser = new TelcomUserBasedOnCollection("13800138000");
		
		//����ͨ����¼
		telcomUser.generateCommunicateRecord();
		
		
		//��ӡͨ���굥
	 telcomUser.printCallToNumber();
}}
