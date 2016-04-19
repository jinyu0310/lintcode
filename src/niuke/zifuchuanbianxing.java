package niuke;

import hihoCoder.charRemove;

import java.util.ArrayList;

import javax.naming.InitialContext;


public class zifuchuanbianxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Character sa = 'a';
    	Character sA = Character.toUpperCase(sa);
    	Character[] sb = new Character[]{'A','b','C'};
    	char[] sc = new char[3];
    	for(int i = 0; i< sb.length;i++){
    		sc[i] = sb[i];
    	}
    	String string  = new String(sc);
    	System.out.println(string);
	}
    public static String trans(String s, int n) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() == 0){
    		return "";
    	}
    	//第一次扫描，变换大小写，同时记录空格的位置
    	Character[] schar = new Character[n];
    	ArrayList<Integer> spaceplace = new ArrayList<Integer>();
    	for(int i = 0; i < n; i++){
    		schar[i] = s.charAt(i);
    		if(schar[i] == ' '){
    			spaceplace.add(i);
    		}else if(Character.isLowerCase(schar[i])){
    			schar[i] = Character.toUpperCase(schar[i]);
    		}else if(Character.isUpperCase(schar[i])){
    			schar[i] = Character.toLowerCase(schar[i]);
    		}
    	}
    	for(int i = 0; i < spaceplace.size()-2; i++){
    		if(i == 0){
    			for(int j = 0 ; j < spaceplace.get(i)/2;j++){
    				char temp = 0;
    				temp = schar[j];
    				schar[spaceplace.get(i)-j] = schar[j];
    				schar[j] = temp;
    			}
    		}else{
    			int start = spaceplace.get(i-1);
    			int end = spaceplace.get(i-1) + (spaceplace.get(i) - start)/2;
    			for(int j = start ; j < end;j++){
    				char temp = 0;
    				temp = schar[j];
    				schar[spaceplace.get(i)-j] = schar[j];
    				schar[j] = temp;
    			}
    		}
    	}
    	
        // write code here
		return s;
        
    }
    
    public static String trans2(String s, int n) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() == 0){
    		return "";
    	}
    	//第一次扫描，变换大小写，同时记录空格的位置
    	Character[] schar = new Character[n];
    	char[] sc = new char[n];
    	ArrayList<Integer> spl = new ArrayList<Integer>();
    	for(int i = 0; i < n; i++){
    		schar[i] = s.charAt(i);
    		if(schar[i] == ' '){
    			spl.add(i);
    			continue;
    		}
    		if(Character.isLowerCase(schar[i])){
    			schar[i] = Character.toUpperCase(schar[i]);
    		}else if(Character.isUpperCase(schar[i])){
    			schar[i] = Character.toLowerCase(schar[i]);
    		}
    	}
    	//这种靠找到空格位置再反转的思路问题多多啊。
    	//果然，剑指offer上的题必须都要自己做一遍的啊！不然知道思路，代码一样写不出来！！
    	int[] spli = new int[spl.size()];
    	for(int i = 0; i < spl.size();i++){
    		spli[i] = spl.get(i);
//    		System.out.println(spli[i]);
    	}
    	if(spli[0] != 0){
    		int start = 0;
    		int end = spli[0]-1;
    		int length = (end - start)/2;
        	for(int i = 0; i <= length; i++){
        		swap(schar,start+i,end-i);
        	}
    	}
    	for(int i = 1; i < spli.length; i++){
    		int start = spli[i-1]+1;
    		int end = spli[i]-1;
    		int length = (end-start)/2;
    		for(int j = 0; j <= length; j++){
    			swap(schar, start+j, end-j);
    		}
    	}
    	if(spli[spli.length - 1] != n-1 ){
        	int start = spli[spli.length - 1] + 1;
        	int end = n-1;
        	int length = (end-start)/2;
        	for(int i = 0; i <= length; i++){
        		swap(schar, start+i, end-i);
        	}
    	}
    	for(int i = 0; i<n/2;i++){
    		swap(schar, i, n-1-i);
    	}
    	for(int i = 0; i< schar.length;i++){
    		sc[i] = schar[i];
    	}
    	String string  = new String(sc);
    	return string;
        
    }
    public static void swap(Character[] schar,int i,int j){
    	Character temp = 0;
    	temp = schar[i];
    	schar[i] = schar[j];
    	schar[j] = temp;
    }
    
    public static String trans3(String s, int n) {
    	if(s == null){
    		return null;
    	}
    	if(s.length() == 0){
    		return "";
    	}
    	Character[] schar = new Character[n];
    	char[] sc = new char[n];
    	ArrayList<Integer> spl = new ArrayList<Integer>();
    	for(int i = 0; i < n; i++){
    		schar[i] = s.charAt(i);
    		if(schar[i] == ' '){
    			spl.add(i);
    			continue;
    		}
    		if(Character.isLowerCase(schar[i])){
    			schar[i] = Character.toUpperCase(schar[i]);
    		}else if(Character.isUpperCase(schar[i])){
    			schar[i] = Character.toLowerCase(schar[i]);
    		}
    	}
    	int begin = 0;
    	int end = n-1;
    	//反转整个句子
    	reverse(schar, begin, end);
    	begin = end = 0;
    	while(begin < n){
    		System.out.println(end);
    		if(schar[begin] == ' '){
    			begin++;
    			end++;
    		}else if(end >= n || schar[end] == ' '){
    			reverse(schar, begin, --end);
    			begin = ++end;
    		}else{
    			end++;
    		}
    	}
    	for(int i = 0; i< schar.length;i++){
    		sc[i] = schar[i];
    	}
    	String string  = new String(sc);
    	return string;
        
    }
    
    public static void reverse(Character[] schar,int begin, int end) {
		if(begin < 0 || end > schar.length){
			return;
		}
		while(begin < end){
	    	Character temp = schar[begin];
	    	schar[begin] = schar[end];
	    	schar[end] = temp;
	    	begin++;
	    	end--;
		}
	}
	
}
