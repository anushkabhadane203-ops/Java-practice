package com.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pojo.Book;
import com.util.Hibutil;

public class BookDAO {

    private static SessionFactory sf;

    static {
        sf = Hibutil.getSessionFactory();
    }

    public BookDAO() {
        System.out.println("BookDAO Created...");
    }

    // Show All Books
    public List<Book> getAllBooks() {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        String hql = "from Book";

        Query<Book> query = session.createQuery(hql, Book.class);

        List<Book> bookList = query.getResultList();

        session.getTransaction().commit();
        session.close();

        return bookList;
    }

    // Add New Book
    public void saveBook(Book newBook) {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        session.save(newBook);

        session.getTransaction().commit();
        session.close();

        System.out.println("Book Added Successfully...");
    }

    // Search Book By Id
    public Book getBookById(int bid) {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        Book book = session.get(Book.class, bid);

        session.getTransaction().commit();
        session.close();

        return book;
    }

    // Update Book
    public void editBook(Book book) {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        session.update(book);

        session.getTransaction().commit();
        session.close();

        System.out.println("Book Updated Successfully...");
    }

    // Delete Book
    public void deleteBook(int bid) {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        Book book = session.get(Book.class, bid);

        if (book != null) {
            session.delete(book);
            System.out.println("Book Deleted Successfully...");
        } else {
            System.out.println("Book Not Found...");
        }

        session.getTransaction().commit();
        session.close();
    }

    // Search Books By Author
    public List<Book> getBookByAuthor(String author) {

        Session session = sf.getCurrentSession();
        session.beginTransaction();

        String hql = "from Book bk where bk.author = :auth";

        Query<Book> query = session.createQuery(hql, Book.class);

        query.setParameter("auth", author);

        List<Book> list = query.getResultList();

        session.getTransaction().commit();
        session.close();

        return list;
    }
}