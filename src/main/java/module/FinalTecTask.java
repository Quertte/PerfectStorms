package module;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTecTask {

    private static final String[] books = new String[100];
    private static int position;

    static {
        books[0] = "Clean Code";
        books[1] = "Java Hortsman";
        books[2] = "Java Shildt";
        position = 3;
    }

    public void add(String bookName) {
        if (position < books.length - 1) books[position++] = bookName;
        else System.out.println("The storage is full!");
    }

    public String[] showAll() {
        return Arrays.copyOf(books, position);
    }

    public String showByName(String bookName) {
        String book = null;
        for (int i = 0; i < position; i++) {
            String nameBook = books[i];
            if (nameBook.equals(bookName)) {
                book = nameBook;
            }
        }
        return book;
    }

    private int indexOf(String name) {
        int rs1 = -1;
        for (int i = 0; i < position; i++) {
            if (books[i].equals(name)) {
                rs1 = i;
                break;
            }
        }
        return rs1;
    }

    public boolean editBook(String name, Scanner scanner) {
        int index = indexOf(name);
        boolean rs1 = index != -1;
        if (rs1) {
            System.out.println("Enter a new name: ");
            String newName = scanner.nextLine();
            books[index] = newName;
        }
        return rs1;
    }

    public boolean deleteBook(String nameOfBook) {
        int index = indexOf(nameOfBook);
        boolean rs1 = index != -1;
        if (rs1) {
            int start = index + 1;
            int length = position - index;
            System.arraycopy(books, start, books, index, length);
            books[position - 1] = null;
            position--;
        }
        return rs1;
    }

    private void showMenu(String[] actions) {
        System.out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            System.out.println((i + 1) + ". " + actions[i]);
        }
    }

    public void gui(Scanner scanner, FinalTecTask finalTecTask, String[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            System.out.print("Select menu item: ");
            String select = scanner.nextLine();
            if (select.equals("1")) {
                FinalTecTask.addBook(scanner, finalTecTask);
                incorrect(scanner);
            } else if (select.equals("2")) {
                FinalTecTask.showAllBooks(finalTecTask);
                incorrect(scanner);
            } else if (select.equals("3")) {
                FinalTecTask.editBook(scanner, finalTecTask);
                incorrect(scanner);
            } else if (select.equals("4")) {
                FinalTecTask.deleteBook(scanner, finalTecTask);
                incorrect(scanner);
            } else if (select.equals("5")) {
                FinalTecTask.showByNameBook(scanner, finalTecTask);
                incorrect(scanner);
            } else if (select.equals("6")) {
                sortBooks();
                incorrect(scanner);
            } else if (select.equals("7")) {
                System.out.println("Bye");
                run = false;
            } else {
                System.out.println("Enter the correct number");
            }
        }
    }

    public static void incorrect(Scanner scanner) {
        System.out.println("Press Enter to return to the menu");
        if (!scanner.nextLine().equals("")) {
            System.out.println("You did not press Enter, please try again, if you want to exit press any other button");
            if (!scanner.nextLine().equals("")) {
                System.exit(0);
            }
        }
    }

    public static void addBook(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Add new book: ");
        System.out.print("Enter the name of the book: ");
        String name = scanner.nextLine();
        for (int i = 0; i < position; i++) {
            if (name.equals(books[i])) {
                System.out.println("Such a book already exists");
                return;
            }
        }
        finalTecTask.add(name);
        System.out.println("Book added");
    }

    public static void showAllBooks(FinalTecTask finalTecTask) {
        System.out.println("Show all books: ");
        String[] books = finalTecTask.showAll();
        if (books.length != 0) {
            for (String st : books) {
                System.out.println(st);
            }
        } else {
            System.out.println("Storage is empty");
        }
    }

    public static void editBook(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Edit the title of the book");
        System.out.print("Enter the name of the book you want to edit: ");
        String name = scanner.nextLine();
        if (finalTecTask.editBook(name, scanner)) System.out.println("Book title changed successfully");
        else System.out.println("There is no such book!");
    }

    public static void deleteBook(Scanner scanner, FinalTecTask finalTecTask) {
        if (position != 0) {
            System.out.println("Delete book");
            System.out.println("Enter the name of the book you want to delete: ");
            String name = scanner.nextLine();
            if (finalTecTask.deleteBook(name)) System.out.println("Book deleted successfully");
            else System.out.println("There is no such book!");
        }else {
            System.out.println("There are no books in storage!");
        }
    }

    public static void showByNameBook(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Find books by name");
        if (position != 0) {
            System.out.print("Enter the name of the book: ");
            String name = scanner.nextLine();
            String nameBook = finalTecTask.showByName(name);
            if (nameBook != null) {
                if (nameBook.equals(name)) {
                    System.out.println("This book is already on the list");
                }
            } else {
                System.out.println("There is no such book on the list");
            }
        } else {
            System.out.println("There are no books in storage");
        }
    }

    public static void sortBooks() {
        String[] sortBooks = new String[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            sortBooks[size++] = books[i];
        }
        sortBooks = Arrays.copyOf(sortBooks, size);
        Arrays.sort(sortBooks);
        for (int i = 0; i < position; i++) {
            books[i] = sortBooks[i];
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinalTecTask finalTecTask = new FinalTecTask();
        String[] action = {"Add new book", "Show all books", "Edit the title of the book", "Delete book",
                "Find books by name", "Sort all books", "Exit program"};
        new FinalTecTask().gui(scanner, finalTecTask, action);
    }
}
