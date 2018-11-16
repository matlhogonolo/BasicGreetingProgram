package com.pkg;

public class ATM {
	
	//main method (Entry of the application)
		public static void main(String[] args) 
		{
			
			Account acc = new Account();
			
			acc.deposit(5000);
			
			System.out.println(acc.toString());
		}

}
