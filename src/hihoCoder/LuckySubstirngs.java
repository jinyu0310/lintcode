package hihoCoder;

import java.util.TreeSet;
import java.util.Scanner;

public class LuckySubstirngs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String s = in.next();
			TreeSet<String> outs = new TreeSet<String>();
			for(int i = 0; i < s.length();i++){
				int count = 0;
				int[] alpha = new int[26];
				for(int j = i;j < s.length();j++){
					if(alpha[s.charAt(j)-'a'] == 0){
						alpha[s.charAt(j)-'a'] = 1;
						count++;
					}
					if(count == 1 || count == 2 || count == 3 ||count == 5 ||count == 8||count == 13 ||count == 21){
						outs.add(s.substring(i, j+1));
					}
				}
			}
			for(String st :outs){
				System.out.println(st);
			}
		}
	}
}
