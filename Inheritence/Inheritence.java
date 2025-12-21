package Inheritence;
class Parents{
  protected String lastName ="alam";//child can access protected variable of parents
  protected String property = "7cr"; 
  protected void Hair(){
    System.out.println("Blond");
  }
}

class Child extends Parents{
  public static void main(String[]args){
    Child child1= new Child();
    System.out.println(child1.lastName);//child can access protected variable of parents
    System.out.println(child1.property);
    child1.Hair();
  }
}
