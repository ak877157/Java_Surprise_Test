package com.org.gen.test.question3;

class UserMainCode{
	static int fact(int n) {
		int res = 1;
		for(int i =2;i<=n; i++) 
			res = res  * i;
		return res;
	}
	
	public static int calculateNcr(int n, int r) {
		return fact(n)/(fact(r)*fact(n-r));
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode u1 = new UserMainCode();
		System.out.println("NCR is :"+u1.calculateNcr(5, 3));

	}

}
