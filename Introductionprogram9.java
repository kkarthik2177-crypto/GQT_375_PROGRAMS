package Corejavaprograms;

public class Introductionprogram9 {
	
	    public static void main(String[] args) {
	        int[] a = {5, 9, 2, 8};
	        int max = a[0], smax = a[0];
	        for(int n : a) {
	            if(n > max) {
	                smax = max;
	                max = n;
	            } else if(n > smax && n != max)
	                smax = n;
	        }
	        System.out.println(smax);
	    }
	}



