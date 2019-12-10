package 模拟银行存取款系统;

import java.util.Scanner;

public class Bank {
int account;
private static User user;
public void operate() {
	
	while(true) {
		System.out.println("请输入你要进行的操作，按回车结束操作");
		System.out.println("\t\t\t 1.存款 \t\t\t");
		System.out.println("\t\t\t 2.取款 \t\t\t");
		System.out.println("\t\t\t 3.余额查询 \t\t\t");
		System.out.println("\t\t\t 0.退出 \t\t\t");
		
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		if("1".equals(s)||"2".equals(s)) {
			int num=0;
			try {
				System.out.println("输入存储金额");
				num=Integer.parseInt(in.nextLine());
				
			}catch(Exception e) {
				System.out.println("金额输入错误");
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
				System.out.println("退出系统！");
				return;
			}else {
				System.out.println("请选择0——3之间的数字正确操作");
			}
		}
	}

private void show() {
	// TODO 自动生成的方法存根
	System.out.println("账户余额为"+user.getAccount());
}
private void takeout(int num) {
	// TODO 自动生成的方法存根
	if(user.getAccount()>=num) {
	account=user.getAccount()-num;
	user.setAccount(account);
	System.out.println("已取出金额"+num);
}else {
	System.out.println("余额不足，取款失败！");
}
	}
private void income(int num) {
	// TODO 自动生成的方法存根
	account=user.getAccount()+num;
	user.setAccount(account);
	System.out.println("已存入金额"+num);
	
	
}
public void login() {
	DBUtil dbutil=DBUtil.getlnstance();
	System.out.println("欢迎进入网上银行系统");
	while(true) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入银行卡号：");
		String cardId = in.nextLine();
		System.out.println("请输入银行卡密码：");
		String cardPwd=in.nextLine();
		user=dbutil.getUser(cardId);
		if(dbutil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
			System.out.println("登陆成功！欢迎"+user.getUserName());
			break;
		}else {
			System.out.println("银行卡号或密码错误");
			continue;
		}
	}
	
}
}
