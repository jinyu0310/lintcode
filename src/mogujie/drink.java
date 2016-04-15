package mogujie;

import java.util.Scanner;

public class drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt(),b = in.nextInt();
			int c = in.nextInt(),d = in.nextInt();
			if(a+b+c+d != 10){
				System.out.println(-1);
			}else{
				if(b > 6 || c > 5 || d > 4){
					System.out.println(-1);
				}
			}
		}
	}

}
