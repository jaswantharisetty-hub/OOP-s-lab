class Advanced_calculator{
   public static void main(String[] args){
      Calculator obj1=new Calculator();
      AdvancedCalculator obj2=new AdvancedCalculator();
      System.out.println("--- Base Object ---");
      obj1.display();
      obj1.add(5,8);
      obj1.show_private();
      System.out.println("--- Child Object ---");
      obj2.display();
      obj2.add(5,8);
      obj2.show_private();
   }
}

class Calculator{
  int sum;
  public void add(int a,int b){
     sum=a+b;
  }
  protected void display(){
     System.out.println("Welcome");
  }
  private void show(){
     System.out.println("sum:"+this.sum);
  }
  public void show_private(){
     show();
  }
}

class AdvancedCalculator extends Calculator{
  int value;
  public void add(int a,int b){
     value=a*b;
  }
  protected void display(){
     System.out.println("this is child class");
  }
  private void show(){
     System.out.println("value:"+this.value);
  }
  public void show_private(){
     show();
  }
}