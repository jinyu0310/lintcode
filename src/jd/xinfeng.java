package jd;

import java.util.Scanner;

public class xinfeng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int w = in.nextInt(),h = in.nextInt();
			int[] wn = new int[n];
			int[] hn = new int[n];
			for(int i = 0; i < n; i++){
				wn[i] = in.nextInt();
				hn[i] = in.nextInt();
			}
		}
	}

}
