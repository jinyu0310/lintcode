package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mmrandan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int[] randannum = new int[100];
			for(int i = 0; i < num; i++){
				randannum[i] = in.nextInt();
			}
			ArrayList<Integer> randNoSame = new ArrayList<Integer>();
			for(int i = 0; i < num; i++){
				if(!randNoSame.contains(randannum[i])){
					randNoSame.add(randannum[i]);
				}				
			}
			Collections.sort(randNoSame);
			for(int re:randNoSame){
				System.out.println(re);
			}
		}
	}

}
