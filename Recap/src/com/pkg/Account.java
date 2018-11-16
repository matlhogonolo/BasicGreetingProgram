package com.pkg;

public class Account {

	private long pin = 2322;
	private double balance = 340.56;
	private String accHolder = "Josefa";
	
	
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	
	public double deposit(double amount) 
	{
		balance = balance + amount;
		
		System.out.println("Depositing " + amount );
		
		return balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pin + " "  + accHolder  + " " + balance;
	}  
	
}

/* 
 * Application Name (e.g .StudentMnagementSystem, AccountManagementSystem, )
 * 
 * Class (class is a blueprint)
 * 
 * Main method (Main entry of the application)
 * 
 * constructor (construct objects of a class)
 * 
 * attributes (local and global) ()
 * 
 * methods/functions (class method & instance method)
 * 
 * 
 */
