package cmbestcoder;

import java.math.BigDecimal;
import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double x1 = in.nextDouble(),y1 = in.nextDouble();
			double x2 = in.nextDouble(),y2 = in.nextDouble();
			double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			BigDecimal b = new BigDecimal(dis);
			double re = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println(re);
		}

	}

}
