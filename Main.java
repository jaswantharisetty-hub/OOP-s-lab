import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scr=new Scanner(System.in);
System.out.print("enter your Student ID: ");
long id=scr.nextLong();
System.out.print("enter name: ");
String name=scr.next();

System.out.print("enter marks scored in maths:");
short sub=scr.nextShort();
System.out.print("enter marks scored in physics:");
byte subj=scr.nextByte();
System.out.print("enter marks scored in chemisty:");
int subj2=scr.nextInt();

float avg=(float)(sub+subj2+subj)/3;
boolean pass;
if(avg>50){
pass=true;
}
else{
pass=false;
}

if(pass){
System.out.println("his Student Id is:"+id);
System.out.println("his name:"+name);
System.out.print("he passed the exam");
}
else{
System.out.println("his Student Id is:"+id);
System.out.println("his name:"+name);
System.out.print("he did not passed the exam");
}
}
}

