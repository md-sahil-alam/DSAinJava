// Static Inner Class
// An inner class can also be static, which means that you can access it without creating an object of the outer class:

//Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.

package javaInner;

class OuterClass{
  int  x = 10;
  static class InnerClass{
    int y  = 20;
  }
}

public class staticInner {
  public static void main(String[] args) {
    OuterClass.InnerClass myobj = new OuterClass.InnerClass();
    System.out.println(myobj.y);
  }
}
