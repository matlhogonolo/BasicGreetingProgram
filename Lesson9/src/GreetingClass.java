//--class
//--attributes
//--constructor 
//--methods (class methods / instance)

import java.util.*;
public  class GreetingClass
{

  public static String name;

  public GreetingClass(){

  }

  public static String Greet(String name)
 {
	return "Hello " + name;
 }


 public static String redirect(String name)
{
  return Greet(name);
}
 public static void main(String[] args)
 {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name....!");
    name = sc.next();
    System.out.println(redirect(name));
 }
}