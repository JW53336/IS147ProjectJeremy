//Jeremy Lee (JW53336) clee30@umbc.edu
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Searcher Obj3 = new Searcher();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, welcome to Jeremy's Library book/genre location searcher. Do you know the title or genre?");
        Obj3.Search(sc.next());
    }
}