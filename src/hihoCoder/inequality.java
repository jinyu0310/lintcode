package hihoCoder;

import java.util.Scanner;

//x从-0.5:0.5:1000.5进行枚举，取满足等式最多的为答案。
//并没有说C是整数，但是当成整数可以得到正确答案，如果不是整数，那么难度大很多！
public class inequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int N = in.nextInt();
			String[] ineq = new String[N];
			for(int i = 0; i < N ; i++){
				ineq[i] = in.nextLine();
			}
			
		}

	}

}
