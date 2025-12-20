class Animal{
  protected void AnimalSound(){
    System.out.println("animal make sound");
  }
}

class Horse extends Animal{
  public void AnimalSound(){
    System.out.println("hoese make eeheeheehee sound");
  }
}

class Cow extends Animal{
  public void AnimalSound(){
    System.out.println("cow makes MMOoOOOoo sound");
  }
}

class Polimorphism {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal horse = new Horse();
    Animal cow = new Cow();

    a1.AnimalSound();
    horse.AnimalSound();
    cow.AnimalSound();
  }
}
