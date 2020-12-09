package com.company;
import java.util.Scanner;
public class Searcher {
    Scanner sc = new Scanner(System.in);
    Genre Obj2 = new Genre();
    private String answer;

    public void Search(String FindType) {
        while (!FindType.toLowerCase().equals("genre") && !FindType.toLowerCase().equals("title")) {
            System.out.println("ERROR; please only type genre or title");
            FindType = sc.next(); }
        if (FindType.toLowerCase().equals("title")) {
            System.out.println("Please ask our desk clerks as they will assist you further"); }
        else {
            Genre.printMenu();
            do {
                System.out.println("Please type the number of the Genre you are searching for.");
                int find = sc.nextInt();
                if (find <= Obj2.getListOrRD("list").length) {
                    Search(find); } }
            while (!answer.toLowerCase().equals("yes"));
            System.out.println("Searching for location");
            System.out.println("........");
            System.out.println("........");
            System.out.println("........");
            System.out.println("Location Found! Please go to the floor and aisle stated next to the genre"); } }
    public void Search(int find) {
        System.out.println("Would you like to search the location for this genre?");
        System.out.println("Yes/No");
        answer = sc.next();
    }
}
