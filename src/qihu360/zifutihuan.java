package qihu360;

import java.util.*;
public class zifutihuan {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //�ж��ж�ȡ������û���ҵ��õķ���
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
        //��һ�ַ��������������������������ڵ�'.'�����һ�Σ������´��ַ�����ͷ����
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
        //�ڶ��ַ���������������'.'�ĸ���count�������Ϊcount-1
        while(i < len - 1){
            //���������һ�ε�������'.'
            if(tmp.charAt(i) == '.' && tmp.charAt(i + 1) == '.'){
                int j = i + 2;
                int c = 2;//�����ж��ٸ�������'.'
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
