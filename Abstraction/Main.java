<<<<<<< HEAD
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
=======
package Abstraction;
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
>>>>>>> 53ce0c80778d9eb28caacbbd1bdae65b75e32cc2
