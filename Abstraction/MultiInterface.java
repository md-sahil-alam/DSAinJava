package Abstraction;

interface bick{
  public void color();
}


interface cycle{
  public void speed();
}

class vehical implements bick,cycle{
  public void color(){
    System.out.println("red");
  }
    public void speed(){
    System.out.println("very fast");
  }
}

public class MultiInterface {
  public static void main(String[] args) {
      vehical v1 = new vehical();
      v1.color();
      v1.speed();
  }
}
