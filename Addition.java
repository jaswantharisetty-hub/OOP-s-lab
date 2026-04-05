import java.util.Scanner;
public class Addition{
  public static void main(String[] args){
      Calculator obj=new Calculator();
      Scanner src=new Scanner(System.in);
      System.out.print("enter first integer:");
      int a=src.nextInt();
      System.out.print("enter second integer:");
      int b=src.nextInt();
      obj.add(a,b);
      obj.show_result();
      System.out.print("enter first integer:");
      int c=src.nextInt();
      System.out.print("enter second integer:");
      int d=src.nextInt();
      System.out.print("enter third integer:");
      int e=src.nextInt();
      obj.add(c,d,e);
      obj.show_result();
      System.out.print("enter first integer:");
      Double f=src.nextDouble();
      System.out.print("enter second integer:");
      Double g=src.nextDouble();
      obj.show(f,g);
      src.close();
  }
}

class Calculator{
  private int results;
  private double result;
  public void add(int a,int b){ 
     results=a+b;
  }
  protected void add(int a,int b,int c){
     results=a+b+c;
  }
  private void add(double a,double b){
     result=a+b;
  }
  public void show_result(){
     System.out.println("Result:"+results);
  }
  public void show(double a,double b){
     add(a,b);
     System.out.println("Result:"+result);
  }
}

