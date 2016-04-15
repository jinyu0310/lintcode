package hihoCoder;

import java.util.Scanner;

public class gupaifugai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int f1 = 1,f2 = 2;
			if(n == 1){
				System.out.println(f1);
			}else{
				for(int i = 2; i< n ; i++){
					int tmp = f1;
					f1 = f2;
					f2 = f1+tmp;
				}
				System.out.println(f2);
			}
		}
	}

}
