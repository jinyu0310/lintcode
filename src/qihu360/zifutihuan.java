package qihu360;

import java.util.*;
public class zifutihuan {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //判断行读取结束，没有找到好的方法
        while(in.hasNext()){
        	int length = in.nextInt();
        	int actionnum = in.nextInt();
            StringBuffer sb = new StringBuffer(in.next());
            int i = 0;
            while(i < actionnum){
                int pos = in.nextInt();
                String sub = in.next();
                sb.replace(pos - 1, pos , sub);
                System.out.println(countReplace(sb));
                i++;
            }
        }
    }
    public static int countReplace(StringBuffer sb){
        StringBuffer tmp = new StringBuffer(sb);
        int len = tmp.length();
        int i = 0;
        int count = 0;
        //第一种方法：依次搜索，遇到两个相邻的'.'则计数一次，再重新从字符串开头计数
        /*while( i < len  - 1){
            if(tmp.charAt(i) == '.' && tmp.charAt(i+1) == '.'){
                tmp.delete(i, i+1);
                len = tmp.length();
                i = 0;
                count++;
            }else{
                i++;
            }
        }*/
        //第二种方法：计算连续的'.'的个数count，则计数为count-1
        while(i < len - 1){
            //如果有至少一次的连续的'.'
            if(tmp.charAt(i) == '.' && tmp.charAt(i + 1) == '.'){
                int j = i + 2;
                int c = 2;//计算有多少个连续的'.'
                while(j < len && tmp.charAt(j) == '.' ){
                    c++;
                    j++;
                }
                count += c - 1;
                i = j;
            }else{
                i++;
            }
        }
        return count;
    }

}
