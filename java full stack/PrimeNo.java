import java.util.Scanner;

public class PrimeNo {

	public static boolean isprime(int n) {
		int i=2;
		for(;i<n/2 && (n % i !=0);i++);
		if((n/2)==i)return true;
		else return false;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(isprime(n) == true) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}