package com.simpli.devops.service;

import com.simpli.devops.model.Books;

import java.util.List;

public interface IBookService {
    Books saveBook(Books books);

    List<Books> getBooks();

    Books getBook(long bookId);

    List<Books> getBooksByName(String bookName);
}
