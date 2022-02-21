package com.org.gen.test.question4;

import java.util.Scanner;

class UserMainCode{
	public static int validatePassword(String s){
		 if (s.length() >= 8) {
		      if (s.contains("#") || s.contains("@") || s.contains("_")) {
		        char c = s.charAt(0);
		        //System.out.println(c);
		        if (Character.isAlphabetic(c)) {
		          char cc = s.charAt(s.length() - 1);
		          
		          if ((Character.isAlphabetic(cc)) || (Character.isDigit(cc)))

		          {
		            if (s.matches(".[0-9]{1,}.")
		                || s.matches(".[a-zA-Z]{1,}.")) {

		            		return 1;
		            } else{
		              return -1;
		            }
		          } else{
		        	  return -1;
		          }
		        }
		         else{
		        	 return -1;
		          }
		      } else{
		    	  return -1;
		      }

		    } else{
		    	return -1;
		    }
	}
}


public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int res =UserMainCode.validatePassword(s);
		
		if(res==1) {
			System.out.println("Valid");
		}
		else
			System.out.println("Not Valid");
		}


}

