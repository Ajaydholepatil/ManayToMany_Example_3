package com.mahagan.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
//This is my third ManyToMany mapping relationship application.
@Entity
@Table(name = "Authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    private String authorsEmail;
    private String authorEducation;

    @ManyToMany(targetEntity = Books.class,cascade = CascadeType.ALL)
    @JoinTable(name = "books_authors",joinColumns ={@JoinColumn(name = "authorId")}
            ,inverseJoinColumns = {@JoinColumn(name = "id")})
    Set<Books>books = new HashSet<Books>();

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorsEmail() {
        return authorsEmail;
    }

    public void setAuthorsEmail(String authorsEmail) {
        this.authorsEmail = authorsEmail;
    }

    public String getAuthorEducation() {
        return authorEducation;
    }

    public void setAuthorEducation(String authorEducation) {
        this.authorEducation = authorEducation;
    }


}

