abstract class payment{
    double amount;
    int transactionId;
    payment(double am,int id){
        this.amount=am;
        this.transactionId=id;
    }
    abstract void processPayment();
    public void printRecept(){
        System.out.println("recept was printed Succesfully");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
    }
}

class creditCard extends payment{
    creditCard(double am,int id){
        super(am,id);
    }
    void processPayment(){
        System.out.println("Paid by credit card Succesfully");
    }
}

class UPI extends payment{
    UPI(double am,int id){
        super(am,id);
    }
    void processPayment(){
        System.out.println("Paid by UPI Succesfully");
    }
}

public class Abstractclass{
    public static void main(String args[]){
        creditCard obj1=new creditCard(5000,106);
        obj1.processPayment();
        obj1.printRecept();
        System.out.println("-------------------");
        UPI obj2=new UPI(3000,105);
        obj2.processPayment();
        obj2.printRecept();
    }
}