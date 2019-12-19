package com.practice;

public class BankManager {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		acc1.setCustomerName("Mukesh");
		acc1.setAccountBalance(15000);
		acc1.setAccountNumber(971000971234l);
		acc1.setEmail("mail.abdare@gmail.com");
		acc1.setMobileNumber(9970166901l);
		
		acc1.deposit(890);
		acc1.withdraw(21290);
		
		System.out.println(acc1.getCustomerName()+" Your account balance is " + acc1.getAccountBalance());
		
		
		VipCustomer vc = new VipCustomer();
		System.out.println(vc.getName()+ " " +vc.getEmail()+ " " +vc.getCreditLimit());
		VipCustomer vc1 = new VipCustomer("Mukesh","mukesh@hotstar.com",90000d);
		System.out.println(vc1.getName()+ " " +vc1.getEmail()+ " " +vc1.getCreditLimit());
		VipCustomer vc2 = new VipCustomer("Don","don@hotstar.com");
		System.out.println(vc2.getName()+ " " +vc2.getEmail()+ " " +vc2.getCreditLimit());
		
		
	}

}
