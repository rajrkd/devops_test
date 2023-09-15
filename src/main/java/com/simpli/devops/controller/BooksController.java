package com.simpli.devops.controller;

import com.simpli.devops.model.Books;
import com.simpli.devops.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/devops")
public class BooksController {

    @Autowired
    private IBookService bookService;

    @GetMapping(value = "/getAllBooks", produces = "application/json")
    public List<Books> getAllBooks() {
        return bookService.getBooks();
    }

    @PostMapping(value = "/addBook", consumes = "application/json", produces = "application/json")
    public Books saveBook(@RequestBody Books book, Model model) {
        Books books = bookService.saveBook(book);
        model.addAttribute("bookId", book.getBookId());
        model.addAttribute("bookName", book.getBookName());
        model.addAttribute("authorName", book.getAuthorName());
        return books;
    }

    @PostMapping(value = "/getBookDetails", consumes = "application/json", produces = "application/json")
    public Books getBooksById(@RequestBody Books books) {
        return bookService.getBook(books.getBookId());
    }


}
