 class Helper {
  private String name="asad";

  //get function
  public String getName(){
    return this.name;
  }

  //set function
  public void setName(String name){
    this.name = name;
  }
 }

public class Encapsulation{
      public static void main(String[] args){
      Helper p1 = new Helper();
      p1.setName("sahil");
      System.out.println(p1.getName());
  }
}


