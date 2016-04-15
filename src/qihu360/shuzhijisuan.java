package qihu360;

import java.util.Scanner;

public class shuzhijisuan {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while (in.hasNext()) {
      int n = in.nextInt();
      int b = in.nextInt();
      int numB = 0;
      int numA = 0;
      for (int i = 1; i <= n; i++) {
          numA = 0;
          numB = 0;
          int a = i;
          for (int j = 1; j <= n; j++) {
              if ((int)Math.abs(a - j) < (int)Math.abs(b - j)) {
                  numA++;
              } else {
                  numB++;
              }
          }
          if (numA >= numB) {
              System.out.println(i);
              break;
          }
      }
  }
}
}