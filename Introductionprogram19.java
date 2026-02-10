package Corejavaprograms;

public class Introductionprogram19 {
	    public static void main(String[] args) {
	        int n = 153, t = n, sum = 0;
	        while(n > 0) {
	            int d = n % 10;
	            sum += d*d*d;
	            n /= 10;
	        }
	        System.out.println(sum == t ? "Armstrong" : "Not");
	    }
	}

