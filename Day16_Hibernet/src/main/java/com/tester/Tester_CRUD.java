package com.tester;

import java.util.List;
import java.util.Scanner;

import com.dal.BookDAO;
import com.pojo.Book;

public class Tester_CRUD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookDAO dao = new BookDAO();

        int ch;

        do {

            System.out.println("\n---- Hibernate CRUD -----");
            System.out.println("1: Show All Books");
            System.out.println("2: Add New Book");
            System.out.println("3: Edit Book Details");
            System.out.println("4: Remove Book");
            System.out.println("5: Get Book By Id");
            System.out.println("6 : Get Book By Author");
            System.out.println("0: Exit");
           
            System.out.print("Enter Choice : ");
            ch = sc.nextInt();

            switch (ch) {

            case 1:

                List<Book> books = dao.getAllBooks();

                for (Book b : books) {
                    System.out.println(b);
                }

                break;

            case 2:

                System.out.print("Enter Book Id : ");
                int id = sc.nextInt();

                System.out.print("Enter Book Name : ");
                String name = sc.next();

                System.out.print("Enter Author : ");
                String author = sc.next();

                System.out.print("Enter Price : ");
                double price = sc.nextDouble();

                Book b1 = new Book(id, name, author, price);

                dao.saveBook(b1);

                break;

            case 3:

                System.out.print("Enter Book Id : ");
                int eid = sc.nextInt();

                Book eb = dao.getBookById(eid);

                if (eb != null) {

                    System.out.print("Enter New Name : ");
                    eb.setName(sc.next());

                    System.out.print("Enter New Author : ");
                    eb.setAuthor(sc.next());

                    System.out.print("Enter New Price : ");
                    eb.setPrice(sc.nextDouble());

                    dao.editBook(eb);

                } else {
                    System.out.println("Book Not Found");
                }

                break;

            case 4:

                System.out.print("Enter Book Id : ");
                int did = sc.nextInt();

                dao.deleteBook(did);

                break;

            case 5:

                System.out.print("Enter Book Id : ");
                int sid = sc.nextInt();

                Book bk = dao.getBookById(sid);

                if (bk != null)
                    System.out.println(bk);
                else
                    System.out.println("Book Not Found");

                break;
                
            case 6:

                System.out.print("Enter Author Name : ");
                String author1 = sc.next();

                List<Book> books1 = dao.getBookByAuthor(author1);

                if (books1.isEmpty()) {
                    System.out.println("No Books Found");
                } else {
                    for (Book b : books1) {
                        System.out.println(b);
                    }
                }

                break;

            case 0:

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (ch != 0);

        sc.close();
    }
}