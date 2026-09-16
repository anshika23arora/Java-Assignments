package assignment2;

import java.util.Scanner;

// Abstract Flight class
abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    // Constructor
    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    // Getter methods
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public double getFare() {
        return fare;
    }

    // Abstract method
    public abstract double calculateFare();

    // Override toString()
    @Override
    public String toString() {
        return "Flight No: " + flightNumber
                + " Airline: " + airline
                + " Fare: " + calculateFare();
    }
}


// Domestic Flight class
class DomesticFlight extends Flight {

    public DomesticFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.10);
    }
}


// International Flight class
class InternationalFlight extends Flight {

    public InternationalFlight(String flightNumber, String airline, double fare) {
        super(flightNumber, airline, fare);
    }

    @Override
    public double calculateFare() {
        return getFare() + (getFare() * 0.25);
    }
}


// Main class
public class que2_flight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter flight type,number,airline,fare");

        String input = sc.nextLine();

        String[] data = input.split(",");

        String flightType = data[0].trim();
        String flightNumber = data[1].trim();
        String airline = data[2].trim();
        double fare = Double.parseDouble(data[3].trim());

        Flight flight;

        // Create object according to flight type
        if (flightType.equalsIgnoreCase("Domestic")) {
            flight = new DomesticFlight(flightNumber, airline, fare);
        } else {
            flight = new InternationalFlight(flightNumber, airline, fare);
        }

        // Output
        System.out.println(flight);

        sc.close();
    }
}