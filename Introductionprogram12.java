package Corejavaprograms;

public class Introductionprogram12 {
	    public static void main(String[] args) {
	        String s = "java";
	        char c = 'a';
	        int count = 0;
	        for(char ch : s.toCharArray())
	            if(ch == c) count++;
	        System.out.println(count);
	    }
	}