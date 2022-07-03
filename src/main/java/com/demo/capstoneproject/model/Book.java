package com.demo.capstoneproject.model;


import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter @Setter @Slf4j @ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "book")

public class Book {

    //Creating primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    ////////////////////////WARNING WARNING WARNING//////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////
    //************THE ANNOTATION FOR THESE FIELDS NEED TO BE MODIFIED FOR VALIDATION LATER

    //Creating other fields of book table such as title, tag, authors, publisher, isbn, status and create_date
    @NotNull
    @Column(name = "title")
    String title;

    @NotNull
    @Column(name = "tag")
    String tag;

    @NotNull
    @Column(name = "authors")
    String authors;

    @Column(name = "publisher")
    String publisher;

    @Column(name = "isbn")
    String isbn;

    @Column(name = "status")
    String status;

    @Column(name = "create_date")
    Date createDate;

    //ManyToOne relationship between book and category tables
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    //overriding equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && title.equals(book.title) && tag.equals(book.tag) && authors.equals(book.authors) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn) && Objects.equals(status, book.status) && Objects.equals(createDate, book.createDate);
    }

    //overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, title, tag, authors, publisher, isbn, status, createDate);
    }
}
