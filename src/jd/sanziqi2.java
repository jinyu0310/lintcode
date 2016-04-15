package jd;

import java.util.Scanner;

public class sanziqi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String[] line = new String[3];
			char[][] linechar = new char[3][];
			int xnum = 0;
			int onum = 0;
			int diannum = 0;
			for(int i = 0; i < 3;i++){
				line[i] = in.next();
				linechar[i] = line[i].toCharArray();
				for(int j = 0; j < line[i].length();j++){
					if(line[i].charAt(j) == '0'){
						onum += 1;
					}else if(line[i].charAt(j) == 'X'){
						xnum += 1;
					}	
				}
			}
			diannum = line[1].length()*3 - onum - xnum;
//			System.out.println(xnum);
//			System.out.println(onum);
//			System.out.println(diannum);
			int wonflag1 = 0,wonflag2 = 0;
			
			if( xnum-onum < 0 || xnum - onum > 1){ //非法棋局
				System.out.println('x');
			}else if( xnum-onum == 0 && diannum > 0){ //后手获胜或者先手下
//				System.out.println("2yun");
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == '0'){
							//System.out.println("2 won");
							wonflag2 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				if(wonflag2 == 1 && wonflag1 == 1){
					wonflag2 = 0;
					wonflag1 = 0;
					System.out.println("x");
				}else if (wonflag2 == 1){
					wonflag2 = 0;
					System.out.println("2 won");
				}else{
					System.out.println("1");
				}
			}else if( xnum-onum == 1 && diannum > 0){ //先手获胜或者后手下
//				System.out.println("3yun");
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == '0'){
							//System.out.println("2 won");
							wonflag2 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				if(wonflag2 == 1 && wonflag1 == 1){
					wonflag2 = 0;
					wonflag1 = 0;
					System.out.println("x");
				}else if (wonflag1 == 1){
					wonflag1 = 0;
					System.out.println("1 won");
				}else{
					System.out.println("2");
				}
			}else if( xnum-onum == 0 && diannum == 0){ //后手获胜或者平局
//				System.out.println("3yun");
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == '0'){
							//System.out.println("2 won");
							wonflag2 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				if(wonflag2 == 1 && wonflag1 == 1){
					wonflag2 = 0;
					wonflag1 = 0;
					System.out.println("x");
				}else if (wonflag2 == 1){
					wonflag2 = 0;
					System.out.println("2 won");
				}else{
					System.out.println("draw");
				}
			}else if( xnum-onum == 1 && diannum == 0 ){ //先手获胜或平局
//				System.out.println("4yun");
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == '0'){
							//System.out.println("2 won");
							wonflag2 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == '0'){
						//System.out.println("2 won");
						wonflag2 = 1;
						break;
					}
				}
				for(int i = 0; i < 3 ; i++){
					for(int j = 0; j < line[i].length() - 2; j++){
						if(linechar[i][j] == linechar[i][j+1] && linechar[i][j+1] == linechar[i][j+2] && linechar[i][j+2] == 'X'){
							//System.out.println("2 won");
							wonflag1 = 1;
							break;
						}
					}
				}
				for(int j = 0; j < line[1].length(); j++){
					if(linechar[0][j] == linechar[1][j] && linechar[1][j] == linechar[2][j] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[0][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[2][j+2] && linechar[0][j] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				for(int j = 0; j < line[1].length()-2; j++){
					if(linechar[2][j] == linechar[1][j+1] && linechar[1][j+1] == linechar[0][j+2] && linechar[0][j+2] == 'X'){
						//System.out.println("2 won");
						wonflag1 = 1;
						break;
					}
				}
				if(wonflag2 == 1 && wonflag1 == 1){
					wonflag2 = 0;
					wonflag1 = 0;
					System.out.println("x");
				}else if (wonflag1 == 1){
					wonflag1 = 0;
					System.out.println("1 won");
				}else{
					System.out.println("draw");
				}
			}else{
				
			}

		}
	
	}

}
