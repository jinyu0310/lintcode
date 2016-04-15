package lintcode;

import java.util.ArrayList;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AddBinary.addBinary("10", "1"));
	}
	
    public static String addBinary(String a, String b) {
    	//�����ַ�������ӣ����ڵ���2���λ��
    	//ת����10���ƣ������ת�ɶ����ƣ�
    	int n = Math.max(a.length(), b.length());
    	int[] a1 = new int[n], b1 = new int[n];
    	for(int i = 0; i < a.length(); i++){
    		a1[n-1-i] = (int)(a.charAt(a.length()-1-i)-'0');
    	}
    	for(int i = 0; i < b.length();i++){
    		b1[n-1-i] = (int)(b.charAt(b.length()-1-i)-'0');
    	}
    	ArrayList<Integer> output = new ArrayList<Integer>();
		int c = 0;
		String a1sString = "",b1sString = "";
		for(int i = 0; i < n ;i++){
			a1sString += a1[i];
			b1sString += b1[i];
		}
		System.out.println(a1sString);
		System.out.println(b1sString);
    	for(int i = n-1; i >= 0;i--){
			if((a1[i] + b1[i] + c) >= 2){			
				output.add((a1[i] + b1[i] + c)%2);
				c = 1;
			}else{
				output.add(a1[i] + b1[i] + c);
				c = 0;
			}
    	}
    	String outString = "";
    	for(Integer e:output){
    		outString = e + outString;
    	}
    	if(c == 1){
    		outString = "" + 1 + outString;
    	}
    	return  outString;
        // Write your code here
    }

}
