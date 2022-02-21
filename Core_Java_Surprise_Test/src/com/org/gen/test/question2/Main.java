package com.org.gen.test.question2;
import java.util.Scanner;

class UserMainCode{
	public static boolean validateColorCode(String s1) {
        boolean b = false, b1 = false;
        String s2 = s1.substring(1, s1.length());
        if (s1.length() == 7)
            if (s1.charAt(0) == '#')
            b1 = true;
        if (b1 == true)
            for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c != '#') {
                if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
                    b = true;
                else {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter the string value = ");
        String s1 = s.next();
        
        UserMainCode u1 = new UserMainCode();
        boolean b = u1.validateColorCode(s1);
        if (b == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    
    
}