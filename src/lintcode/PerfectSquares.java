package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param n a positive integer
     * @return an integer
     */
    public static int numSquares(int n) {
    	int maxn = (int) Math.sqrt(n);
    	int minnum = n;
    	int minnumer = maxn;
    	HashMap<Integer, ArrayList<Integer>> nums = new HashMap<Integer, ArrayList<Integer>>();
    	while(maxn > 0){
    		ArrayList<Integer> numes = new ArrayList<Integer>();
        	int sum = maxn*maxn;
        	numes.add(maxn);
        	int num = 1;
        	int minn = maxn;
        	while( sum != n){//以x开头的组合达到要求之后就放弃搜索了，而没有搜索完所有路径！！
        		if(sum > n){
        			sum = sum - minn*minn;
        			minn--; //相当于超过sum之后只往回退了一步，并没有穷尽所有路径！！
        			sum = sum + minn*minn;
        			numes.set(num-1, minn);
        		}else{
        			sum = sum + minn*minn;
        			num++;
        			numes.add(minn);
        		}
        	}
        	if(num < minnum){
        		minnum = num;
        		minnumer = maxn;
        	}
        	nums.put(maxn, numes);
        	maxn--;
    	}
    	
    	for(Integer e:nums.get(minnumer)){
    		System.out.println(e);
    	}
    	
		return minnum;
        // Write your code here
    }
    
    public static int numSquaresDP(int n) {
        int[] dp = new int[n+1];
        // 将所有非平方数的结果置最大，保证之后比较的时候不被选中
        Arrays.fill(dp, Integer.MAX_VALUE);
        // 将所有平方数的结果置1
        for(int i = 0; i * i <= n; i++){
            dp[i * i] = 1;
        }
        // 从小到大找任意数a
        for(int a = 0; a <= n; a++){
            // 从小到大找平方数bｘb
            for(int b = 0; a + b * b <= n; b++){
                // 因为a+b*b可能本身就是平方数，所以我们要取两个中较小的
                dp[a + b * b] = Math.min(dp[a] + 1, dp[a + b * b]);
            }
        }
        return dp[n];
        // Write your code here
    }
}
