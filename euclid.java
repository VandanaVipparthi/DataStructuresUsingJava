package algorithms;
import java.util.*;
public class euclid {
	static int gcd (int m,int n) {
		if(m/n==0) {
			return n;
		}
		else {
			int r=m/n;
			return gcd(n,r);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,n;
		System.out.println("Enter m and n values such that m>n");
		m=sc.nextInt();
		n=sc.nextInt();
		if(m>n) {
			System.out.println(gcd(m,n));
		}
		else {
			System.out.println("Please make sure m>n");
			System.exit(0);
		}

	}

}
