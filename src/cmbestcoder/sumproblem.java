package cmbestcoder;

import java.util.Scanner;

public class sumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int sum = n*(n+1)/2;
			System.out.println(sum);
			System.out.println("\r\n");
		}
	}
}
