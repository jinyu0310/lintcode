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
        	while( sum != n){//��x��ͷ����ϴﵽҪ��֮��ͷ��������ˣ���û������������·������
        		if(sum > n){
        			sum = sum - minn*minn;
        			minn--; //�൱�ڳ���sum֮��ֻ��������һ������û�������·������
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
        // �����з�ƽ�����Ľ������󣬱�֤֮��Ƚϵ�ʱ�򲻱�ѡ��
        Arrays.fill(dp, Integer.MAX_VALUE);
        // ������ƽ�����Ľ����1
        for(int i = 0; i * i <= n; i++){
            dp[i * i] = 1;
        }
        // ��С������������a
        for(int a = 0; a <= n; a++){
            // ��С������ƽ����b��b
            for(int b = 0; a + b * b <= n; b++){
                // ��Ϊa+b*b���ܱ������ƽ��������������Ҫȡ�����н�С��
                dp[a + b * b] = Math.min(dp[a] + 1, dp[a + b * b]);
            }
        }
        return dp[n];
        // Write your code here
    }
}
