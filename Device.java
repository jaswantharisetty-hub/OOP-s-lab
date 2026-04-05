class Device{
   public static void main(String[] args){
       AppNotifier obj1=new AppNotifier();
       obj1.send("System update");
       obj1.send("System update","user@example.com");
       obj1.send("System update",25151553);
       obj1.call_send("System update","user@example.com",2415056);
       obj1.demonstrateInheritance();
   }
}

class Notifier{
   public void send(String Message){
       System.out.println("General msg alert");
   }
   protected void send(String Message,String email){
       System.out.println("alert email");
   }
   void send(String Message,long phoneNumber){
       System.out.println("sms alert");
   }
   private void send(String Message,long phoneNumber,String email){
       System.out.println("sms,email alert");
   }
   public void call_send(String Message,String email,long phoneNumber){
       this.send(Message,phoneNumber,email);
   }
}

class AppNotifier extends Notifier{
    public void demonstrateInheritance() {
        send("Subclass General");          
        send("Subclass Email", "u@ex.com"); 
        send("Subclass SMS", 9876543210L); 
    }
}