package com.pluralsight;

public class Book {

    //Create variables
    private int id;
    private String title;
    private String author;
    private String isbn;
    public boolean isCheckedOut;
    public String checkedOutTo;

    //Constructor
    public Book(int id, String title, String author ,String isbn, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    //Getters
    public int getID() {return id;}
    public String getTitle() { return title;}
    public String getAuthor() { return author;}
    public String getIsbn(){return isbn;}
    public boolean getIsCheckedOut(){return isCheckedOut;}
    public String getCheckedOutTo(){return checkedOutTo;}

    //Setters
    public void setCheckedOut(boolean checkedOut){
        this.isCheckedOut = checkedOut;
    }
    public void setCheckedOutTo(String name){
        this.checkedOutTo = name;
    }
    //Display book info
    public void displayInfo(){
        System.out.println("ID: " + id + " Title: " + title + " Author: " + author + " | ISBN: " + isbn + " | Checked Out: " + (isCheckedOut ? "Yes" : "No") + (isCheckedOut ? " | To: " + checkedOutTo : ""));
    }

}
