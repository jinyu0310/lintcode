package lintcode;

import java.util.Scanner;

public class qishuipin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] result = new int[10];
		int i = 0;
		while(in.hasNext()){
			int input = in.nextInt();
			if( input == 0){
				break;
			}
			result[i] = input/2;
			i++;
		}
		for( int j = 0; j < i ;j++){
			System.out.println(result[j]);
		}
	}

}
