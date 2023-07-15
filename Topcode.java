package topper;

import java.util.Scanner;

public class Topcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int var = n;
		int a = 0;
		int b = 0;
		int c = 0;
		while(var>0) {
			a = var&10;
			if(a%2 == 0) {
				b += c;
			}
			else
				c += a;
			var /= 10;
			}
		if(b == 0);
		{
			System.out.println("true");	
		}
		 {
	    	System.out.println("false");
		
	}

}
}
