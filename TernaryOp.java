package operators;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter your age:");
	       age=sc.nextInt();
	      String res= (age>18)?"Eligible for Vote":"Not Eligible for vote";
	      System.out.println(res);
		}


	}


