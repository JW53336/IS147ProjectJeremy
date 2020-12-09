package com.company;

public class Genre extends books {

    public static void printMenu() {
        books Obj1 = new books();
        System.out.println("************Genre************");
        System.out.println("1. Fiction   --Floor 1 Aisle 1A");
        System.out.println("2. Nonfiction--Floor 1 Aisle 2A");
        System.out.println("3. Fantasy   --Floor 2 Aisle 3A");
        System.out.println("4. Mystery   --Floor 3 Aisle 4A");
        System.out.println("5. Thriller  --Floor B1 Aisle 1A");
        System.out.println("6. Romance   --Floor B1 Aisle 3C");
        System.out.println("7. Science   --Floor B2 Aisle 2C");
        System.out.println("8. Westerns  --Floor B3 Aisle 5D");

    }
}