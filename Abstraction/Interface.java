package Abstraction;

interface First{
  public void soun();
}

class Sec implements First {
  public void soun(){
    System.out.println("ZZzz");
  }
}

public class Interface {
  public static void main(String[] args) {
      Sec s1 = new Sec();
      s1.soun();
  }
}
