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
        System.out.println("获胜最大概率的数为： ");      
        for (int i = 0; i < inputList.size(); i++) 
        {           
            String inputString = inputList.get(i);          
            String[] ss = inputString.split(" ");           
            int n = Integer.parseInt(ss[0].trim()); //范围n
            int b = Integer.parseInt(ss[1].trim()); //小B选择的数            
            System.out.println(getA(n, b));             
        }   
    }

    public static int getA(int n,int b){        
        int maxCount = 0;//记录当前最大的胜利次数      
        int maxCountA = 0;//记录当前最大的胜利次数对应的a值        
        for(int a =1; a<= n;a++)    //小A选择的数
        {       
            if(a == b)  //A和B不能选择相同的数
            {
                continue;
            }           
            int count = 0;  //临时记录获胜的次数
            for(int c = 1; c<=n; c++)//此处为c
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
