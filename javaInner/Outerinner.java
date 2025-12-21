package javaInner;
//In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.To access the inner class, create an object of the outer class, and then create an object of the inner class

class Outer{
  int x  = 10;
    class inner{
    int y = 20;
   }
}

public class Outerinner {
  public static void main(String[] args) {
    Outer myOuter = new Outer();
    Outer.inner myInner = myOuter.new inner();
    System.out.println(myInner.y + myOuter.x );
  }
}
