package qihu360;

import java.util.ArrayList;
import java.util.Scanner;

public class shuziyouxi1 { 
    public static void main(String[] args) {            
        Scanner scanner = new Scanner(System.in);       
        ArrayList<String> inputList = new ArrayList<String>();      
        while(true)
        {
            String getString = scanner.nextLine();          
            if(getString.trim().length()==0)
            {
                break;
            }           
            inputList.add(getString);           
        }       
        System.out.println("��ʤ�����ʵ���Ϊ�� ");      
        for (int i = 0; i < inputList.size(); i++) 
        {           
            String inputString = inputList.get(i);          
            String[] ss = inputString.split(" ");           
            int n = Integer.parseInt(ss[0].trim()); //��Χn
            int b = Integer.parseInt(ss[1].trim()); //СBѡ�����            
            System.out.println(getA(n, b));             
        }   
    }

    public static int getA(int n,int b){        
        int maxCount = 0;//��¼��ǰ����ʤ������      
        int maxCountA = 0;//��¼��ǰ����ʤ��������Ӧ��aֵ        
        for(int a =1; a<= n;a++)    //СAѡ�����
        {       
            if(a == b)  //A��B����ѡ����ͬ����
            {
                continue;
            }           
            int count = 0;  //��ʱ��¼��ʤ�Ĵ���
            for(int c = 1; c<=n; c++)//�˴�Ϊc
            {                   
                if(Math.abs(a-c)<Math.abs(b-c))
                {
                    count ++;                   
                }           
            }           
            if(count>maxCount)
            {
                maxCount = count;               
                maxCountA = a;
            }           
        }       
        return maxCountA;       
    }
}
