package Array;

public class LeanierSearch {
  public static void main(String[] args) {
      int[] arr = {3,11,1,98,4,7,46,6,34,7};
      System.out.println(search(arr, 6));
  }
  static int search(int[] arr , int target){
    if(arr.length == 0){
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==target){
       return i;
      }
    }
    return -1;
  }
}
