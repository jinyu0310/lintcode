package hihoCoder;

import java.util.Scanner;

public class charRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int charnum = in.nextInt();
			int[] outnum = new int[charnum];
			String[] ABC = new String[]{"A","B","C"};
			
			for(int i = 0; i< charnum; i++){
				String s = in.next();
				String sremove = remove(s); //先取出原始字符串中的重复字符！
				int removeMin = sremove.length();
				for(int j = 0; j <= sremove.length(); j++){
					for(int k = 0; k < ABC.length; k++){
						StringBuilder sbuild = new StringBuilder();
						sbuild.append(sremove); //构建sb类，插入字符形成新串，对新串重新执行remove！
						sbuild.insert(j, ABC[k]);
						String snew  = new String(sbuild);
						String sbRemove = remove(snew);
						if(sbRemove.length() < removeMin){
							removeMin = sbRemove.length();
						}
						
					}
				}
				outnum[i] = s.length() - removeMin + 1;
			}
			for(int i = 0; i< charnum; i++){
				System.out.println(outnum[i]);
			} 
		}
	}
	
	public static String remove(String s){
		String sreplaceA = s.replaceAll("A{2,}", "");
		String sreplaceB = sreplaceA.replaceAll("B{2,}", "");
		String sreplaceC = sreplaceB.replaceAll("C{2,}", "");
		if(sreplaceC.length() == s.length()){
			return sreplaceC;
		}else{
			return remove(sreplaceC);
		}
	}

}
