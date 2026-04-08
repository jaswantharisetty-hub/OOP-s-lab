interface remoteControle{
    public void turnOn();
    void turnOff();
}

class Tv implements remoteControle{
    public void turnOn(){
        System.out.println("TV is turned ONN");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class AC implements remoteControle {

    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

class Fan implements remoteControle {

    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

public class Interfaces{
    public static void main(String[] args) {
        Tv obj1=new Tv();
        obj1.turnOn();
        obj1.turnOff();
        System.out.println("-------------------");
        AC obj2=new AC();
        obj2.turnOn();
        obj2.turnOff();
        System.out.println("-------------------");
        Fan obj3=new Fan();
        obj3.turnOn();
        obj3.turnOff();
    }
}