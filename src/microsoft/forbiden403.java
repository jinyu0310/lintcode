package microsoft;

import java.util.ArrayList;
import java.util.Scanner;

public class forbiden403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int N = in.nextInt(),M = in.nextInt();
			String[] rules = new String[N+1];
			ArrayList<String> allowrules = new ArrayList<String>();
			ArrayList<String> denyrules = new ArrayList<String>();
			for(int i = 0; i < N+1;i++){
				rules[i] = in.nextLine();
			}
			for(int i = 1; i < N+1;i++){
				if(rules[i].contains("allow")){
					allowrules.add(rules[i]);
				}else if(rules[i].contains("deny")){
					denyrules.add(rules[i]);
				}
			}
			String[] output = new String[M];
			int[][] allownum = new int[allowrules.size()][];
			int[][] denynum = new int[denyrules.size()][];
			int[] allowmask = new int[allowrules.size()];
			int[] denymask = new int[denyrules.size()];
			for(int i = 0; i < denyrules.size();i++){
				String denyi = denyrules.get(i);
				int denyindex = denyi.indexOf('/');
				if(denyindex == -1){
					denymask[i] = 32;
				}else{
					String denyithnum = denyi.substring(denyindex+1);
					denymask[i] = Integer.parseInt(denyithnum);
				}
			}
			for(int i = 0; i < allowrules.size();i++){
				String allowi = allowrules.get(i);
				int allowindex = allowi.indexOf('/');
				if(allowindex == -1){
					allowmask[i] = 32;
				}else{
					String allowithnum = allowi.substring(allowindex+1);
					allowmask[i] = Integer.parseInt(allowithnum);
				}
				int firstdian = allowi.indexOf('.');
				int firstnum = Integer.parseInt(allowi.substring(6, firstdian));
				int seconddian = allowi.indexOf('.',firstdian+1);
				int secondnum = Integer.parseInt(allowi.substring(firstdian+1, seconddian));
				int thirddian = allowi.indexOf('.',seconddian+1);
				int thirdnum = Integer.parseInt(allowi.substring(seconddian+1, thirddian));	
				int fourthnum = 0;
				if(allowindex == -1){
					fourthnum = Integer.parseInt(allowi.substring(thirddian+1));
				}else{
					fourthnum = Integer.parseInt(allowi.substring(thirddian+1,allowindex));
				}			
			}
			
			for(int i = 0; i < denyrules.size();i++){
				String denyi = denyrules.get(i);
				int denyindex = denyi.indexOf('/');
				if(denyindex == -1){
					denymask[i] = 32;
				}else{
					String denyithnum = denyi.substring(denyindex+1);
					denymask[i] = Integer.parseInt(denyithnum);
				}
				int firstdian = denyi.indexOf('.');
				int firstnum = Integer.parseInt(denyi.substring(6, firstdian));
				int seconddian = denyi.indexOf('.',firstdian+1);
				int secondnum = Integer.parseInt(denyi.substring(firstdian+1, seconddian));
				int thirddian = denyi.indexOf('.',seconddian+1);
				int thirdnum = Integer.parseInt(denyi.substring(seconddian+1, thirddian));	
				int fourthnum = 0;
				if(denyindex == -1){
					fourthnum = Integer.parseInt(denyi.substring(thirddian+1));
				}else{
					fourthnum = Integer.parseInt(denyi.substring(thirddian+1,denyindex));
				}			
			}
			
//			for(int i = 0; i < M;i++){
//				String ip = in.nextLine();
//				
//			}
//			for(int i = 0; i < allowrules.size();i++){
//				System.out.println(allowrules.get(i));
//				System.out.println(allowmask[i]);
//			}
//			for(int i = 0; i < denyrules.size();i++){
//				System.out.println(denyrules.get(i));
//				System.out.println(denymask[i]);
//			}
			
		}
	}

}
