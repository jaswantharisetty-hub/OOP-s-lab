import java.util.Scanner;
class Operations{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.print("enter 1st number");
int a=src.nextInt();
System.out.print("enter 2nd number");
int b=src.nextInt();
System.out.print("enter 3rd number");
int c=src.nextInt();
System.out.println("a="+a+" b="+b+" c="+c);

System.out.println("addition of these 2 numbers is "+(a+b));
System.out.println("subtraction of these 2 numbers is "+(a-b));
System.out.println("multiplication of these 2 numbers is "+(a*b));
System.out.println("division of these 2 numbers is "+(a/b));
boolean result=(a%2==0);
System.out.println("a is even? "+result);

System.out.println("a greater than or equal to b?? "+(a>=b));
System.out.println("a is less than or equal to b?? "+(a<=b));
System.out.println("a is equal to b?? "+(a==b));
System.out.println("a is not equal to b?? "+(a!=b));

System.out.println("a is greater than b,c? "+(a>b && a>c));
System.out.println("a is equal to 10 or c is equals to a? "+(a==10 || c==a));

System.out.println("c is equals to "+(c++));
System.out.println("After incrementaion c is equals to "+(c));
System.out.println("After decrementation c is equals to "+(--c));
}
}