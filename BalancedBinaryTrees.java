import java.util.Scanner;

public class DP {
    /*Driver program to test the function */
	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
	System.out.println("Enter the height of the tree");
	int h=s.nextInt();
    System.out.println(balancedTreesOfHeightH(h));
    s.close();
	}

	/* java program to find the number of balanced binary trees of height h */
	public static int balancedTreesOfHeightH(int height){

      int[] dp= new int[height+1];
      int mod=(int)Math.pow(10,9)+7;
      dp[0]=1;
      dp[1]=1;
      for(int i=2;i<height+1;i++){
        long ans1=(long)dp[i-1]*dp[i-1];
        long ans2=(long)2*dp[i-1]*dp[i-2];
         dp[i]=((int)(ans1%mod)+(int)(ans2%mod))%mod;
      }
      return dp[height];
	}


}
