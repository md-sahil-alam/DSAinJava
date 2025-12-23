package LeanierSearch;

public class LeetCodeWealth {
  public static void main(String[] args) {
    int[][] nums = {
            {1,2,3},
            {3,2,1}
    };

    for(int i = 0 ; i< nums.length; i++){
      int Wealth = 0;
      for (int n : nums[i]) {
        Wealth+=n;
      }
      System.out.println("Wealthof person "+" "+i+" = "+Wealth);
    }
  } 
}
