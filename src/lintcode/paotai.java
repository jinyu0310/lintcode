package lintcode;

import java.util.Scanner;

public class paotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int bit = 0;
			int r = input.nextInt();
			int x0 = input.nextInt(),y0 = input.nextInt();
			int x1 = input.nextInt(),y1 = input.nextInt();
			int x2 = input.nextInt(),y2 = input.nextInt();
			int x3 = input.nextInt(),y3 = input.nextInt();
			if((x0-x3)*(x0-x3) + (y0-y3)*(y0-y3) <= r*r){
				bit += 1;
			}
			if((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3) <= r*r){
				bit += 1;
			}
			if((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3) <= r*r){
				bit += 1;
			}
			String outS = String.valueOf(bit)+"x";
			System.out.println(outS);
		}	
	}

}
