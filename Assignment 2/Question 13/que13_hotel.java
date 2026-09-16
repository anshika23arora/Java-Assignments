package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Guest {
    String name;
    int age;
    String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }
}

class Reservation {
    String reservationId;
    String roomType;
    List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    void addGuest(Guest guest) {
        guests.add(guest);
    }

    void display() {
        System.out.println("Reservation ID: " + reservationId +
                " Room: " + roomType);

        System.out.println("Guests:");

        for (Guest guest : guests) {
            System.out.println(guest.name + ", " +
                    guest.age + ", " + guest.idProof);
        }
    }
}

public class que13_hotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String reservationId = sc.next();
        String roomType = sc.next();
        int numberOfGuests = sc.nextInt();

        Reservation reservation =
                new Reservation(reservationId, roomType);

        for (int i = 0; i < numberOfGuests; i++) {

            String name = sc.next();
            int age = sc.nextInt();
            String idProof = sc.next();

            Guest guest = new Guest(name, age, idProof);

            reservation.addGuest(guest);
        }

        reservation.display();

        sc.close();
    }
}