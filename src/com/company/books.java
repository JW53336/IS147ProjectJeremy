package com.company;

public class books {
    private double Fiction = 1;
    private double Nonfiction = 2;
    private double Fantasy = 3;
    private double Mystery = 4;
    private double Thriller = 5;
    private static double Romance = 6;
    private String[] List = {"Fiction", "Nonfiction", "Fantasy", "Mystery", "Thriller", "Romance", "Science", "Westerns"};

    public double getBook(int book){
        double books= 10;
        switch(book){
            case 0 :
                books = Fiction;
                break;
            case 1 :
                books = Nonfiction;
                break;
            case 2 :
                books = Fantasy;
                break;
            case 3 :
                books = Mystery;
                break;
            case 4 :
                books = Thriller;
                break;
            default:
                System.out.println("error");
                break;
        }
        return books;
    }

    public double getListOrRD(int num){
        return Romance;
    }
    public String[] getListOrRD(String list){
        return List;
    }
}