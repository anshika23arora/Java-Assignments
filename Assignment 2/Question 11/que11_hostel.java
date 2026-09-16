package assignment2;

import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }
}

class HostelStudent {
    private String name;
    private String roll;
    private String course;
    private Room room;

    public HostelStudent(String name, String roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course;
    }
}

public class que11_hostel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        String[] studentData = sc.nextLine().split(",");

        String name = studentData[0].trim();
        String roll = studentData[1].trim();
        String course = studentData[2].trim();

        // Room details
        String[] roomData = sc.nextLine().split(",");

        String roomNumber = roomData[0].trim();
        String block = roomData[1].trim();
        String type = roomData[2].trim();

        // Create Room object
        Room room = new Room(roomNumber, block, type);

        // Create Student object
        HostelStudent student =
                new HostelStudent(name, roll, course, room);

        System.out.println(student);

        sc.close();
    }
}