package module_2.homeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class House {
    private int id;
    private int numberOfApartment;
    private int area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int lifeTime;
    private static final Scanner scanner = new Scanner(System.in);
    private static final House[] houses = new House[]{
            new House(1, 2, 34, 5, 2),
            new House(2, 2, 50, 4, 3),
            new House(3, 4, 60, 3, 2),
            new House(4, 3, 28, 2, 4),
            new House(5, 3, 20, 2, 2),
            new House(6, 4, 35, 3, 1),
            new House(7, 2, 46, 4, 1),
            new House(8, 3, 50, 2, 3)
    };


    public House() {

    }

    public House(int id, int numberOfApartment, int area, int floor, int numberOfRooms) {
        this.id = id;
        this.numberOfApartment = numberOfApartment;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int id, int numberOfApartment, int area, int floor, int numberOfRooms, String street, String buildingType) {
        this.id = id;
        this.numberOfApartment = numberOfApartment;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
    }

    public House(int id, int numberOfApartment, int area, int floor, int numberOfRooms, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.numberOfApartment = numberOfApartment;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numberOfApartment=" + numberOfApartment +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }

    public static void numberOfRooms(House[] houses) {
        System.out.println("Enter the number of rooms: ");
        int count = Integer.parseInt(scanner.nextLine());
        boolean run = false;
        for (House house : houses) {
            if (count == house.numberOfRooms) {
                System.out.println(house);
                run = true;
            }
        }
        if (!run) {
            System.out.println("No such apartments found!");
        }
    }

    public static void numberOfRoomsOnFloor(House[] houses) {
        System.out.println("Enter the number of rooms: ");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the minimum number of Apartment: ");
        int minNumberOfRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the maximum number of Apartment: ");
        int maxNumberOfRoom = Integer.parseInt(scanner.nextLine());
        boolean run = false;
        for (House house : houses) {
            if (count == house.numberOfRooms) {
                if (floor == house.floor && house.numberOfApartment <= maxNumberOfRoom
                        && house.numberOfApartment >= minNumberOfRoom) {
                    System.out.println(house);
                    run = true;
                }
            }
        }
        if (!run) {
            System.out.println("No such apartments found!");
        }
    }

    public static void areaRooms(House[] houses) {
        System.out.println("Enter the area of the apartment: ");
        int area = Integer.parseInt(scanner.nextLine());
        boolean run = false;
        for (House house : houses) {
            if (house.area > area) {
                System.out.println(house);
                run = true;
            }
        }
        if (!run) {
            System.out.println("No such apartments found!");
        }
    }

    public static void main(String[] args) {
        String[] menu = {"A list of apartments with a given number of rooms.",
                "A list of apartments with a given number of rooms and located on a floor that is in a given interval.",
                "a list of apartments with an area exceeding the specified one."};
        while (true) {
            menu(menu);
            System.out.print("Select menu item: ");
            int select = Integer.parseInt(scanner.nextLine());
            select(select, houses);
            System.out.println("If you want to exit press Enter");
            if (scanner.nextLine().equals("")) {
                System.exit(0);
            }
        }

    }

    public static void menu(String[] menu) {
        System.out.println("Menu ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }

    private static void menuItem(int count, House[] houses) {
        switch (count) {
            case 1 -> House.numberOfRooms(houses);
            case 2 -> House.numberOfRoomsOnFloor(houses);
            case 3 -> House.areaRooms(houses);
        }
    }

    private static void select(int select, House[] houses) {
        if (select >= 1 && select <= 3) {
            menuItem(select, houses);
        } else {
            System.out.println("Wrong menu item entered, please try again");
        }
    }
}
