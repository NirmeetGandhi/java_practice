package com.company;
import java.util.Scanner;

class Library{
    String [] availableBooks;
    String [] issuedBooks  = new String[10];
    public void user_inputs(){
        Scanner sc = new Scanner(System.in);
        int user_input;
        int user_input_borrow;
//        System.out.println("press 1 for Available Books, 2 for Issued Books and 3 to Return Book and 4 to Exit");
//        int user_input = sc.nextInt();
        do{

            System.out.println("press 1 to see Available Books, 2 to Borrow Books , 3 to Return Book and 4 to Exit");
            user_input = sc.nextInt();
            switch (user_input) {
                case 1:
                    System.out.println("Available Books are");
                    System.out.println();
                    showAvailableBooks();
                    System.out.println();
                    break;
                case 2:
//                    System.out.println("you have successfully borrowed the book!!");
                    System.out.println();
                    System.out.println("Here are some List of  Available books to borrow: ");
                    System.out.println();
                    showAvailableBooks();
                    System.out.println();
                    System.out.println("Press the number given against the book to borrow that book");
//                    Scanner sc1 = new Scanner(System.in);
                    user_input_borrow = sc.nextInt();
                    switch (user_input_borrow){
                        case 1:
                            System.out.println("You have successfully borrowed the book \"The Jungle Book\". ");
                            break;
                        case 2:
                            System.out.println("You have successfully borrowed the book \"MahaBharat\".");
                            break;
                        case 3:
                            System.out.println("You have successfully borrowed the book \"Ramayan\". ");
                            break;
                        case 4:
                            System.out.println("You have successfully borrowed the book \"The Merchant of Venice\" .");
                            break;
                        case 5:
                            System.out.println("You have successfully borrowed the book \"The Invisible Man\". ");
                            break;
                        case 6:
                            System.out.println("You have successfully borrowed the book \"Harry Potter\".");
                            break;
                        case 7:
                            System.out.println("You have successfully borrowed the book \"Believe It or Not\".");
                            break;
                        case 8:
                            System.out.println("You have successfully borrowed the book \"Maths\".");
                            break;
                        case 9:
                            System.out.println("You have successfully borrowed the book \"Computer\".");
                            break;
                        case 10:
                            System.out.println("You have successfully borrowed the book \"Physics\".");
                            break;
                    }
                    break;

                case 3:
//                    int user_input_borrow;\
                    System.out.println("please select no of book which you have taken to return book");
                    showAvailableBooks();
                    int user_return;
                    user_return  = sc.nextInt();
                    switch (user_return){
                        case 1:
                            System.out.println("You have successfully returned the book \"The Jungle Book\". ");
                            break;
                        case 2:
                            System.out.println("You have successfully returned the book \"MahaBharat\".");
                            break;
                        case 3:
                            System.out.println("You have successfully returned the book \"Ramayan\". ");
                            break;
                        case 4:
                            System.out.println("You have successfully returned the book \"The Merchant of Venice\" .");
                            break;
                        case 5:
                            System.out.println("You have successfully returned the book \"The Invisible Man\". ");
                            break;
                        case 6:
                            System.out.println("You have successfully returned the book \"Harry Potter\".");
                            break;
                        case 7:
                            System.out.println("You have successfully returned the book \"Believe It or Not\".");
                            break;
                        case 8:
                            System.out.println("You have successfully returned the book \"Maths\".");
                            break;
                        case 9:
                            System.out.println("You have successfully returned the book \"Computer\".");
                            break;
                        case 10:
                            System.out.println("You have successfully returned the book \"Physics\".");
                            break;
                    }
                    if (user_return < 10){
                        System.out.println("Please choose the number between 0 and 10 only");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank you for coming and reading books");
                    System.out.println();
                    System.out.println("“We do believe something very magical can happen when you read a good book.”");
            }
        }while (user_input!=4);
    }
    public void showAvailableBooks() {
        String [] availableBooks  = {
                "The Jungle Book (press 1 to borrow)",
                "MahaBharat (press 2 to borrow)"
                ,"Ramayan (press 3 to borrow)"
                ,"The Merchant of Venice (press 4 to borrow)"
                ,"The Invisible Man (press 5 to borrow)",
                "Harry Potter (press 6 to borrow)"
                ,"Believe It or Not (press 7 to borrow)"
                ,"Maths (press 8 to borrow)"
                ,"Computer (press 9 to borrow)"
                ,"Physics (press 10 to borrow)"
        };
        for (String e: availableBooks){
            System.out.println(e);
        }
    }

//    public void showAvailableBooks(){
//        for (String e: availableBooks){
//            System.out.println(e);
//        }
}

public class Exercise_4_library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        System.out.println("Thank You For Visiting This Library Management System Mase By \"Nirmeet_Gandhi\" , This LMS IS Still" +
                "Under The Process");
        System.out.println();
        System.out.println();
        Library lb = new Library();
//        System.out.println("Available books are:");
//        System.out.println();
//        lb.showAvailableBooks();
        lb.user_inputs();
//           lb.showAvailableBooks();
    }
}
