import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	
 
  
  Scanner x = new Scanner(System.in);
  System.out.println("enter int value");
  int num = x.next().charAt(0);
  
  if((num >= '0')&&(num <='9')) {
  System.out.println("yes it is num");
  }
  else {
	  System.out.println("no not a num");
  }
  }
	}


