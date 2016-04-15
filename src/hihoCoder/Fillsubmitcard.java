package hihoCoder;

import java.util.Scanner;

public class Fillsubmitcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int testNum = in.nextInt();
			int[] output = new int[testNum];
			for(int i = 0;i <testNum;i++){
				int N = in.nextInt();
				int M = in.nextInt();
				int[] loss = new int[N];
				for(int j = 0; j < N ; j++){
					loss[j] = in.nextInt();
				}
				if(M>=N){
					output[i] = 100;
				}else{
					int maxdis = loss[M];
					for(int k = 0;k < N-M-1;k++){
						if((loss[k+M+1]-loss[k]) > maxdis){
							maxdis = loss[k+M+1]-loss[k];
						}
					}
					output[i] = maxdis-1;
				}
			}
			for(int i = 0; i < testNum;i++){
				System.out.println(output[i]);
			}
		}
	}
}
