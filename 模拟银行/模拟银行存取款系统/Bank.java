package ģ�����д�ȡ��ϵͳ;

import java.util.Scanner;

public class Bank {
int account;
private static User user;
public void operate() {
	
	while(true) {
		System.out.println("��������Ҫ���еĲ��������س���������");
		System.out.println("\t\t\t 1.��� \t\t\t");
		System.out.println("\t\t\t 2.ȡ�� \t\t\t");
		System.out.println("\t\t\t 3.����ѯ \t\t\t");
		System.out.println("\t\t\t 0.�˳� \t\t\t");
		
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		if("1".equals(s)||"2".equals(s)) {
			int num=0;
			try {
				System.out.println("����洢���");
				num=Integer.parseInt(in.nextLine());
				
			}catch(Exception e) {
				System.out.println("����������");
				continue;
			}
			switch(s) {
			case "1":
				income(num);
				break;
			case "2":
				takeout(num);
				break;
			}}
			else if("3".equals(s)) {
				show();
			}else if("0".equals(s)) {
				System.out.println("�˳�ϵͳ��");
				return;
			}else {
				System.out.println("��ѡ��0����3֮���������ȷ����");
			}
		}
	}

private void show() {
	// TODO �Զ����ɵķ������
	System.out.println("�˻����Ϊ"+user.getAccount());
}
private void takeout(int num) {
	// TODO �Զ����ɵķ������
	if(user.getAccount()>=num) {
	account=user.getAccount()-num;
	user.setAccount(account);
	System.out.println("��ȡ�����"+num);
}else {
	System.out.println("���㣬ȡ��ʧ�ܣ�");
}
	}
private void income(int num) {
	// TODO �Զ����ɵķ������
	account=user.getAccount()+num;
	user.setAccount(account);
	System.out.println("�Ѵ�����"+num);
	
	
}
public void login() {
	DBUtil dbutil=DBUtil.getlnstance();
	System.out.println("��ӭ������������ϵͳ");
	while(true) {
		Scanner in=new Scanner(System.in);
		System.out.println("���������п��ţ�");
		String cardId = in.nextLine();
		System.out.println("���������п����룺");
		String cardPwd=in.nextLine();
		user=dbutil.getUser(cardId);
		if(dbutil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
			System.out.println("��½�ɹ�����ӭ"+user.getUserName());
			break;
		}else {
			System.out.println("���п��Ż��������");
			continue;
		}
	}
	
}
}
