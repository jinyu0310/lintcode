package microsoft;

import java.util.Scanner;

public class FontSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int testNum = in.nextInt();
			int[] output = new int[2];
			for(int i = 0; i< testNum;i++){
				int N = in.nextInt(),P = in.nextInt();
				int W = in.nextInt(),H = in.nextInt();
				int[] a = new int[N];
				int sumai = 0;
				for(int j = 0; j < N; j++){
					a[i] = in.nextInt();
					sumai += a[i];
				}
				//每页最少的字符数
				int minnum = (int) Math.ceil((double)sumai/P);
				int maxsize = Math.min(W, H);
				//int minsize = 0;
				for(int j = 1; j <= maxsize;j++){
					int everyline = (int) Math.floor((double)W/j);
					int lineNum = (int) Math.floor((double)H/j);
					if(everyline*lineNum < minnum){						
						output[i] = j - 1;
						break;
					}
					output[i] = j;
				}
			}
			for(int i = 0; i < testNum; i++){
				System.out.println(output[i]);
			}
		}
	}

}



//int sump = 0;
//for(int k = 0; k < N; k++){
//	sump += Math.ceil((double)a[k]/output[i]);
//	while(sump > P){
//		output[i] -= 1;
//		for(int h = 0; h < N; h++){
//			sump += Math.ceil((double)a[h]/output[i]);
//		}
//	}
//}
