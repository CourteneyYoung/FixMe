/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.courts.vc.prjfixactivitybroken;

/**
 *
 * @author young
 */
public class PrjFixActivityBroken {

    public static void main(String[] args) {

         String[][] books = {{"B101", "The Giver", "4"},
                            {"B102", "1984", "6"}
                            {"B103", "Pride & Prejudice", "3"},
                            {"B104", "To Kill a Mockingbird", "5"}};

        String choice = JOptionPane.showInputDialog("Enter 1 to view all books\nEnter 2 to search for a book");

        if choice.equals("1")
        {
            displayAllBooks(books);
        }
        else if (choice == "2")
        {
            searchBook books;
        }
        else
            JOptionPane.showMessageDialog("Invalid selection")
    }

    private static void displayAllBooks(String[] books)
    {
        String output = "Library Book List:\n\n";
        int total = 0;

        for (int i = 0; i < books.length; i++) 
        {
            output += "ID: " + books[i][0] + ", Title: " + books[i][1] + ", Copies: " + books[i][2] + "\n";
            total = total + books[i][2];
        }

        JOptionPane.showMessageDialog(null, output + "\nTotal copies in library: " + total);
    }

    private static void searchBook(String books)
    {
        String id = JOptionPane.showInputDialog("Enter the Book ID to search:");

        for (int i = 0; i < books.length; i++)
        {
            if (id.equalsIgnore(books[i][0]))
            {
                JOptionPane.showMessageDialog("Book Found!\nTitle: " + books[i][1] + "\nCopies: " + books[i][2]);
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No book found with that ID");
            }
        }
    }
}