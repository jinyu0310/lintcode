package hihoCoder;

import java.util.Scanner;


public class marshtomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String s = in.nextLine();
			String slower = s.toLowerCase();
			String slist = s.replaceAll("[mM][aA][rR][sS][hH][tT][oO][mM][pP]","fjxmlhx");
			System.out.println(slist);
//			String[] slis = slower.split("marshtomp");
//			for(int i = 0 ;i < slis.length;i++){
//				System.out.println(slis[i]);
//			}
		}
	}
}
