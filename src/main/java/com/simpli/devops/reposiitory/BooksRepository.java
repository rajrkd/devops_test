package com.simpli.devops.reposiitory;

import com.simpli.devops.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    Optional<Books> findByBookId(Long bookId);

    Optional<List<Books>> findByBookName(String bookName);

}
