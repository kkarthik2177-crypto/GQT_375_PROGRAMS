package Corejavaprograms2;

import java.util.Scanner;

public class Operator15 {

	
	    static int power(int a, int b) {
	        if (b == 0)
	            return 1;
	        return a * power(a, b - 1);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter A value");
	        int a = sc.nextInt();
	        System.out.println(" Enter B value");
	        int b = sc.nextInt();
	        System.out.println(power(a, b));
	    }
	}
