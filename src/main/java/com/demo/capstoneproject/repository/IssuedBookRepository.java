package com.demo.capstoneproject.repository;

import com.demo.capstoneproject.model.Book;
import com.demo.capstoneproject.model.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Long> {

    public Long countByBookAndReturned(Book book, Integer returned);
}
