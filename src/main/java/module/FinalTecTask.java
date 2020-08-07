package module;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTecTask {

    private static final String[] books = new String[100];
    private static int position;

    public void add(String bookName) {
        if (position < books.length - 1) books[position++] = bookName;
        else System.out.println("The storage is full!");
    }

    public String[] showAll() {
        return Arrays.copyOf(books, position);
    }

    public String[] showByNameOrId(String bookName) {
        String[] nameBook = new String[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            String name = books[i];
            if (name.equals(bookName)) {
                nameBook[size++] = name;
            }
        }
        nameBook = Arrays.copyOf(nameBook, size);
        return nameBook;
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
        System.out.println("Menu: ");
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
            } else if (select.equals("2")) {
                FinalTecTask.showAllBooks(finalTecTask);
            } else if (select.equals("3")) {
                FinalTecTask.editBooks(scanner, finalTecTask);
            } else if (select.equals("4")) {
                FinalTecTask.deleteBook(scanner, finalTecTask);
            } else if (select.equals("5")) {
                FinalTecTask.showAllByNameOrId(scanner, finalTecTask);
            } else if (select.equals("6")) {
                sortBooks();
            } else if (select.equals("7")) {
                System.out.println("Bye");
                run = false;
            } else {
                System.out.println("Enter the correct number");
            }
        }
    }

    public static void addBook(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Add new book: ");
        System.out.print("Enter the name of the book: ");
        String name = scanner.nextLine();
        finalTecTask.add(name);
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

    public static void editBooks(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Edit the title of the book");
        System.out.print("Enter the name of the book you want to edit: ");
        String name = scanner.nextLine();
        if (finalTecTask.editBook(name, scanner)) System.out.println("Book title changed successfully");
        else System.out.println("There is no such book!");
    }

    public static void deleteBook(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Delete book");
        System.out.println("Enter the name of the book you want to delete: ");
        String name = scanner.nextLine();
        if (finalTecTask.deleteBook(name)) System.out.println("Book deleted successfully");
        else System.out.println("There is no such book!");
    }

    public static void showAllByNameOrId(Scanner scanner, FinalTecTask finalTecTask) {
        System.out.println("Find books by name");
        System.out.print("Enter the name or ID of the book: ");
        String name = scanner.nextLine();
        String[] names = finalTecTask.showByNameOrId(name);
        if (names.length != 0) {
            for (String st : names) {
                System.out.println(st);
            }
        } else {
            System.out.println("There are no such books");
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
                "Find books by name or ID", "Sort all books", "Exit program"};
        new FinalTecTask().gui(scanner, finalTecTask, action);

    }
}
