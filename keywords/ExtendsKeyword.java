package keywords;

public class ExtendsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan();
        fan.turnOn();       
        fan.turnOff();      
        fan.changeSpeed();
	}
}
class Appliance {
    void turnOn() {
        System.out.println("The appliance is turned on.");
    }
    void turnOff() {
        System.out.println("The appliance is turned off.");
    }
}
class Fan extends Appliance {
    void changeSpeed() {
        System.out.println("The fan speed is changed.");
    }
    @Override
    void turnOn() {
        System.out.println("The fan is turned on by pulling a cord.");
    }
}
