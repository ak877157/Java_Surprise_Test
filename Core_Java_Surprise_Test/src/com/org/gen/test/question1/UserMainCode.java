package com.org.gen.test.question1;
import java.util.Scanner;

public class UserMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your last reading = ");
	    String s1 = sc.nextLine();
	    System.out.println("Enter your current reading = ");
	    String s2 = sc.nextLine();
	    System.out.println(" Enter per unit charge = ");
	    int n1 = sc.nextInt();
	    
	    int n2 = calculateElectricBill(s1, s2, n1);
	    System.out.println(" Electric Bill is = " +n2);
		
	}
	
	public static int calculateElectricBill(String inp1, String inp2, int inp3) {
	    int n1 = Integer.parseInt(inp1.substring(5, inp1.length()));
	    int n2 = Integer.parseInt(inp2.substring(5, inp2.length()));
	    int n = Math.abs((n2 - n1) * inp3);
	    return n;
	  }

}