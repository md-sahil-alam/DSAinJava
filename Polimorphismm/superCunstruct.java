package Polimorphismm;

class Fish{
  Fish(){// parent custructor 
    System.out.println("fish are beautifule");
  }
}

class Goldfish extends Fish{

  Goldfish() {
    super();//calling parent custructor
    System.out.println("gold fish are tasty");
  }
  

}

public class superCunstruct {
  public static void main(String[] args) {
     Goldfish goldfish = new Goldfish();
  }
}
