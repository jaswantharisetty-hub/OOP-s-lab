import java.util.Scanner;
class Switch{
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        System.out.print("enter your desired size (1, 2, 3, 4, or 5):");
        int ans=src.nextInt();
        switch(ans){
            case 1:
                System.out.println("Extra Small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Large");
                break;
            case 5:
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("Invalid size number");
        }
    }
}