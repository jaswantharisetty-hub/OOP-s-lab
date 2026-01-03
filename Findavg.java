class Findavg{
public float avg(int a,int b,int c){
float average=(a+b+c)/3;
return average;
}
public static void main(String[] args){
Findavg a=new Findavg();
System.out.print("average of 10,20,30 is: "+a.avg(10,20,30));
}
}
