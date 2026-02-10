package Corejavaprograms2;

import java.util.Scanner;

public class Operator20 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a value");
	        int a = sc.nextInt();
	        System.out.println("Enter b value");
	        int b = sc.nextInt();

	        int max = (a > b) ? a : b;
	        while (true) {
	            if (max % a == 0 && max % b == 0) {
	                System.out.println("LCM = " + max);
	                break;
	            }
	            max++;
	        }
	    }
	}

