package lintcode;

import java.util.Scanner;

public class banyuanzhuo {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int r = in.nextInt();
            int x = in.nextInt(),y = in.nextInt();
            int x1 = in.nextInt(),y1 = in.nextInt();
            
            double dis = Math.sqrt(Math.pow((x-x1),2) + Math.pow((y-y1),2));
            System.out.println(dis);
            int step = (int)(Math.round(dis/(2*r)));
            System.out.println(step);
        }
    }

}
