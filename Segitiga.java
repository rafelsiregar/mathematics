package warmup;

import java.util.Scanner;

public class Segitiga {
	
	public static int gcd(int a, int b) {
		while(b>0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int lower = s.nextInt();
		int upper = s.nextInt();
		int x = 2, y = 1;
		int count = 0;
		s.close();
		while(2*x*(x+y)<upper) {
			while(y<x) {
				if(gcd(x, y)==1) {
					if(2*x*(x+y)>=lower) {
						if(2*x*(x+y)<=upper)
							count++;
						else
							break;
					}
				}
				y +=2;
			}
			x++;
			y = (x%2==0)? 1 : 2;
		}
		System.out.println(count);
	}

}
