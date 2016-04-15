package hihoCoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int x = in.nextInt(),y = in.nextInt();
			ArrayList<Integer> xlist = new ArrayList<Integer>();
			ArrayList<Integer> ylist = new ArrayList<Integer>();
			for(int i = 1; i <= x; i++){
				if(x%i == 0){
					xlist.add(i);
				}
			}
			for(int i = 1; i <= y; i++){
				if(y%i == 0){
					ylist.add(i);
				}
			}
			String output;
			for(int i = 0;i < xlist.size();i++){
				for(int j = 0; j< ylist.size(); j++){
					output = ""+xlist.get(i)+" "+ ylist.get(j);
					System.out.println(output);
				}
			}
 		}
	}

}
