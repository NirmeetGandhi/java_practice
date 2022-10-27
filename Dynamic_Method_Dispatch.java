package com.company;

class Booksss{
    private String author_name;
    String [] authors = {"Nir","Pur","Har","Het","Y"};

}
class Book_Publication extends Booksss{
    private String title;
    String [] Books = {"Nirww","Puwwr","Harww","Hewwt","Yww"};
}
class Paper_Publication extends Booksss{
    private String title;
    String [] paper_publication = {"12","2","2","223","223"};
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Booksss b = new Book_Publication();

    }
}
