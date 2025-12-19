package Abstraction;
abstract class Main{
  public String name = "sahil";
  public int age = 21;
  public abstract void sayhi();
}

class Students extends Main{
  public int gyear=2028;
  public void sayhi(){
    System.out.println("hii");
  } 
}
