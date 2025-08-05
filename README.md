# FixMe
I am broken - debug me!

## ✅ Instructions for Students

The **Library Book Tracker** program is meant to:

- 📚 Store book data in a **2D array**
- 📋 Display **all books**
- 🔍 Search for a **book by ID**
- ➕ Calculate the **total number of copies in stock**

---

But… the **code is broken**! 😱  
Your task is to **fix it**.

### 🛠️ What You Need to Do:

1. **Find and fix ALL errors** in the code.
2. Make the program **run correctly** and compile without errors.
3. Thoroughly **test** the following:
   - ✅ View all books
   - ✅ Search for an **existing book**
   - ✅ Search for a **non-existing book**
   - ✅ Check if the **total number of copies** is correctly displayed

---

### ✨ BONUS (Extra Marks):

You can earn extra marks if you:

- 🔧 **Add a feature** to allow a librarian to **add a new book** to the list
- ⚠️ Handle **empty input** or **invalid entries** gracefully using error checking

## 🧩 Broken Starter Code

```java
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
