package lintcode;

import java.util.Scanner;

public class maxjiange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int[] nums = new int[num];
			for(int i = 0; i < num ; i++){
				if(! in.hasNext()){
					break;
				}else{
					nums[i] = in.nextInt();
				}
			}
			int[] dis = new int[num-1];
			int maxdis = 0;
			for(int i = 1; i < num; i++){
				dis[i-1] = nums[i] - nums[i-1];
				if(dis[i-1]>maxdis){
					maxdis=dis[i-1];
				}
			}
			System.out.println(maxdis);
			int minsum = 0;
			for(int i = 0; i < dis.length-1; i++){
				if((dis[i]+dis[i+1]) >= maxdis){
					minsum = maxdis;
				}
				if((dis[i]+dis[i+1]) > maxdis && (dis[i]+dis[i+1]) < minsum){
					minsum = dis[i]+dis[i+1];
				}
			}
			System.out.println(minsum);
		}
	}

}
