package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner theScanner = new Scanner (System.in);

        Book[] books = new Book[20];
        books[0] = new Book(1, "The Fault In Our Stars", "John Green", "978-0142424179",true,"Marques");
        books[1] = new Book(2, "The Butterfly Effect", "Andy Andrews","10-1404187804", false, "");
        books[2] = new Book(3, "The Hunger Games", "Suzanne Collins", "978-0439023528", false,"");
        books[3] = new Book(4, "To Kill a Mockingbird", "Harper Lee", "978-0061120084sd",false,"");
        books[4] = new Book(5, "The Maze Runner", "James Dashner", "978-0385737951",false,"");
        books[5] = new Book(6, "Fourth Wing", "Rebecca Yarros", "978-1659474042",true,"Estefani");
        books[6] = new Book(7, "Iron Flame", "Rebecca Yarros", "978-1649377579",false,"");
        books[7] = new Book(8, "Onyx Storm", "Rebecca Yarros", "978-1649377159",false,"");
        books[8] = new Book(9, "Twilight", "Stephenie Meyer", "978-0316015844",false,"");
        books[9] = new Book(10, "The Ember Crown", "Devon Pierce", "978-8889990001",false,"");
        books[10] = new Book(11, "Ashes and Rain", "Zoey Winters", "978-9990001112",false,"");
        books[11] = new Book(12, "Wolves of the Neon City", "Tobias Gale", "978-0001112223",false,"");
        books[12] = new Book(13, "The Hollow Path", "Mara Ellison", "978-1112223335",false,"");
        books[13] = new Book(14, "Dreamcatcher Protocol", "Ryker Vaughn", "978-2223334446",false,"");
        books[14] = new Book(15, "The Library of Glass", "Celeste Orion", "978-3334445557",false,"");
        books[15] = new Book(16, "Fire in the Fog", "Julian Skye", "978-4445556668",false,"");
        books[16] = new Book(17, "Silent Requiem", "Nova Thorne", "978-5556667779",false,"");
        books[17] = new Book(18, "Echo Circuit", "Dex Harmon", "978-6667778890",false,"");
        books[18] = new Book(19, "The Night Archivist", "Isla Quinn", "978-7778889901",false,"");
        books[19] = new Book(20, "Whispers Beyond the Gate", "Owen Talbot", "978-8889990012",false,"");


        System.out.println("""
                Welcome to the Library!
                Please select your option:
                1) Show All Books
                2) Show Available Books
                3) Show Checked Out Books
                4) Check Out a Book
                5) Exit
                """);
        int option = theScanner.nextInt();

        switch (option) {
            case (1):
                System.out.println("\nAll Books: ");
                for (Book book : books) {
                    book.displayInfo();
                }
            case (2):
                System.out.println("Here are the books available: ");
                for(Book book : books){
                    if(!book.getIsCheckedOut()){
                        System.out.println(book.getTitle() + " " + book.getAuthor());
                    }
                }
            case(3):
                System.out.println("Here are the books currently checked out: ");
                for(Book book:books){
                    if(book.getIsCheckedOut()){
                        System.out.println(book.getTitle() + " " + book.getAuthor() + " | Checked out to: " + book.getCheckedOutTo());
                    }
                }
            case(4):
                System.out.println("Here are the books available: ");
                for(Book book : books){
                    if(!book.getIsCheckedOut()){
                        System.out.println("ID: " + book.getID() + " " + book.getTitle() + " by " + book.getAuthor());
                    }
                }
                System.out.print("Please enter the ID # of the book you would like to check out: ");
                int bookChoice = theScanner.nextInt();
                theScanner.nextLine();

                boolean available = false;

                for (Book book : books) {
                    if (book != null && book.getID() == bookChoice){
                        available = true;
                        if (!book.getIsCheckedOut()){
                            System.out.print("Enter your name: ");
                            String name = theScanner.nextLine();
                            book.setCheckedOut(true);
                            book.setCheckedOutTo(name);
                            System.out.println("Book successfully check out!");
                        }
                        else {
                            System.out.println("Oops, this book has already been checked out to: " + book.getCheckedOutTo());
                        }
                        break;
                    }
                }

                if(!available){
                    System.out.println(bookChoice + " is not a valid ID.");
                }
            case(5):
                System.exit(0);
        }


    }
}
