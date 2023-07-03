package com.mahagan.test;
import com.mahagan.domain.Authors;
import com.mahagan.domain.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManayToManyExample3 {
    public static void main(String[] args) {
        StandardServiceRegistry ssrr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssrr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction txs = session.beginTransaction();

        Authors authors = new Authors();
        authors.setAuthorName("ajay dholepatil");
        authors.setAuthorEducation("B.E");
        authors.setAuthorsEmail("ajaydholeptil@gmail.com");


        Books books = new Books();
        books.setBokName("mahagan soft");
        books.setBookPublisher("ajay dholepatil");
        books.setBookEdition("2023");

        authors.getBooks().add(books);
        books.getAuthors().add(authors);

        session.get(Authors.class,"1");
        session.get(Books.class,"1");
        System.out.println("##### data has fetched from db ####");



        System.out.println(authors.getAuthorName()+""+authors.getAuthorEducation()+""+authors.getAuthorsEmail());
        System.out.println(books.getAuthors()+""+books.getBookEdition()+""+books.getBookPublisher());

        session.persist(authors);
        txs.commit();
        session.close();
        System.out.println("#####data has been save and passed successfully in db ####");
    }
}
