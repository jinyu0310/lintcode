package mogujie;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int v = in.nextInt();
			int[] a = new int[9];
			int mina = v;
			int minnum = 0;
			int minnext = 0;
			for(int i = 0; i < 9; i++){
				a[i] = in.nextInt();
				if(a[i] <= mina){
					mina = a[i];
					minnum = i;
				}
			}
			if(mina == v && minnum == 0){
				System.out.println(-1);
			}else{
				int output = 0;
				if(v%mina != 0){
					for(int j = 0; j < v/mina - 1;j++){
						output += (minnum+1)*Math.pow(10,j);
					}
					for(int k = minnum; k < 9; k++){
						if(a[k] <= (v-mina*(v/mina - 1))){
							minnext = k;
						}
					}
					System.out.println(minnext);
					output += (minnext+1)*Math.pow(10,v/mina-1);
				}else{
					for(int j = 0; j < v/mina;j++){
						output += (minnum+1)*Math.pow(10,j);
					}

				}
				System.out.println(output);
			}

		}
	}

}
