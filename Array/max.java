package Array;

public class max {
  public static void main(String[] args) {
      int[] arr = {23,65,12,7,2,7,4};
      System.out.println(arrmax(arr,0,6));
  }
  static int arrmax(int[] arr,int start,int end){
    int max = arr[start];
    for (int i = start; i < end; i++) {
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }
}
