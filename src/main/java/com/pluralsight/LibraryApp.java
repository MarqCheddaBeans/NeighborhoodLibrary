package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner theScanner = new Scanner (System.in);

        Book[] books = new Book[20];
        books[0] = new Book(1, "The Fault In Our Stars", "John Green", "978-0142424179");
        books[1] = new Book(2, "The Butterfly Effect", "Andy Andrews","10-1404187804");
        books[2] = new Book(3, "The Hunger Games", "Suzanne Collins", "978-0439023528");
        books[3] = new Book(4, "To Kill a Mockingbird", "Harper Lee", "978-0061120084sd");
        books[4] = new Book(5, "The Maze Runner", "James Dashner", "978-0385737951");
        books[5] = new Book(6, "Fourth Wing", "Rebecca Yarros", "978-1659474042");
        books[6] = new Book(7, "Iron Flame", "Rebecca Yarros", "978-1649377579");
        books[7] = new Book(8, "Onyx Storm", "Rebecca Yarros", "978-1649377159");
        books[8] = new Book(9, "Twilight", "Stephenie Meyer", "978-0316015844");
        books[9] = new Book(10, "The Ember Crown", "Devon Pierce", "978-8889990001");
        books[10] = new Book(11, "Ashes and Rain", "Zoey Winters", "978-9990001112");
        books[11] = new Book(12, "Wolves of the Neon City", "Tobias Gale", "978-0001112223");
        books[12] = new Book(13, "The Hollow Path", "Mara Ellison", "978-1112223335");
        books[13] = new Book(14, "Dreamcatcher Protocol", "Ryker Vaughn", "978-2223334446");
        books[14] = new Book(15, "The Library of Glass", "Celeste Orion", "978-3334445557");
        books[15] = new Book(16, "Fire in the Fog", "Julian Skye", "978-4445556668");
        books[16] = new Book(17, "Silent Requiem", "Nova Thorne", "978-5556667779");
        books[17] = new Book(18, "Echo Circuit", "Dex Harmon", "978-6667778890");
        books[18] = new Book(19, "The Night Archivist", "Isla Quinn", "978-7778889901");
        books[19] = new Book(20, "Whispers Beyond the Gate", "Owen Talbot", "978-8889990012");


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

        if(option == 1){
            System.out.println("\nAll Books:");
            for (Book book : books){
                book.displayInfo();
            }
        }


    }
}
