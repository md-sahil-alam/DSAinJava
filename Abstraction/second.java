<<<<<<< HEAD
package Abstraction;

public class Second{
  public static void main(String[] args) {
      Students s1 = new Students();
      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.gyear);
      s1.sayhi();
  }
=======
package Abstraction;
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
>>>>>>> 53ce0c80778d9eb28caacbbd1bdae65b75e32cc2
}