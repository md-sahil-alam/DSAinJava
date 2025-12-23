package LeanierSearch;

public class EvennoOfDigiLeetcode {
  public static void main(String[] args) {
      int[] nums = {-21,135,2,6,7897}; 
      int evennum = 0;

      for (int i = 0; i < nums.length; i++) {
        int counter = 0;
        int n = Math.abs(nums[i]);
        while (n>0) {
          n/= 10;
          counter++;
        }
        if (counter%2 == 0) {
          evennum++;
        }
      }
      System.out.println(evennum);
  }
}
