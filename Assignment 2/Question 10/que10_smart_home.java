package assignment2;

import java.util.Scanner;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {

    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class que10_smart_home {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String device1 = sc.nextLine();
        String device2 = sc.nextLine();

        Device d1;
        Device d2;

        if (device1.equalsIgnoreCase("Fan")) {
            d1 = new Fan();
        } else {
            d1 = new Light();
        }

        if (device2.equalsIgnoreCase("Fan")) {
            d2 = new Fan();
        } else {
            d2 = new Light();
        }

        d1.turnOn();
        d1.turnOff();

        d2.turnOn();
        d2.turnOff();

        sc.close();
    }
}