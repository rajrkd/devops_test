package com.simpli.devops.service;

import com.simpli.devops.model.Books;
import com.simpli.devops.reposiitory.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    @Transactional
    public Books saveBook(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public List<Books> getBooks() {
        List<Books> booksList = booksRepository.findAll();
        return booksList;
    }

    @Override
    public Books getBook(long bookId) {
        Optional<Books> optional = booksRepository.findByBookId(bookId);
        if (optional.isEmpty()) {
            return null;
        } else {
            return optional.get();
        }
    }

    @Override
    public List<Books> getBooksByName(String bookName) {
        Optional<List<Books>> optional = booksRepository.findByBookName(bookName);
        if (optional.isEmpty()) {
            return null;
        } else {
            List booksList = optional.get();
            return booksList;
        }
    }
}
