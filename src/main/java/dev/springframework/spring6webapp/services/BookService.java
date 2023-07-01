package dev.springframework.spring6webapp.services;

import dev.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
