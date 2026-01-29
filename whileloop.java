import java.util.Scanner;
class whileloop{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.print("enter number:");
int value=src.nextInt();
int rev=0;
do{
int digit=value%10;
rev=rev*10+digit;
value=value/10;
}while(value>0);
System.out.print(rev);
}
}