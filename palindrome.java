import java.util.Scanner;
class palindrome{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.print("enter number:");
int value=src.nextInt();
int ans=value;
int reverse_number=0;
while(ans>0){
int last=ans%10;
ans=ans/10;
reverse_number=reverse_number*10+last;
}
if(reverse_number==value){
System.out.print(value+" is palindrome");
}
else{
System.out.print(value+" is not a palindrome");
}
}
}