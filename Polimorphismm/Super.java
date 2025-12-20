package Polimorphismm;
class Bird{
  String type = "mammle";
  public void sound(){
    System.out.println("Bird make sound");
  }
}

class Parrate extends Bird{
  String type = "parrate";
  public void sound(){
    System.out.println(super.type);//accessing from parent
  }
} 

public class Super {
  public static void main(String[] args){
    Bird a1 = new Bird();
    Bird c1 = new Parrate();

    a1.sound();
    c1.sound();
  }

}
