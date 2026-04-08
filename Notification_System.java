interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}

public class Notification_System {
    public static void main(String[] args) {

        EmailNotification n1=new EmailNotification();
        n1.send("Welcome to our service!");

        SMSNotification n2 = new SMSNotification();
        n2.send("Your OTP is 1234");

        PushNotification n3 = new PushNotification();
        n3.send("You have a new message");
    }
}